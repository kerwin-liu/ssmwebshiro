package com.kerwin.ssm.business.management.controller;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Qo.StatisticsQo;
import com.kerwin.ssm.business.management.model.Vo.StatisticsByClientVo;
import com.kerwin.ssm.business.management.model.Vo.StatisticsVo;
import com.kerwin.ssm.business.management.service.StatisticsService;
import com.kerwin.ssm.common.ExportExcel;
import com.kerwin.ssm.common.web.BaseController;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kerwin.liu on 2018/8/13.
 */
@Controller
@RequestMapping("statistics")
public class StatisticsController extends BaseController{
    @Autowired
    StatisticsService statisticsServiceimpl;
    @GetMapping("getStatistics")
    public void getstatistics(HttpServletResponse response, StatisticsQo statisticsQo ) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        //根据条件查询相关统计信息
        List<StatisticsVo> statisticsVoList = statisticsServiceimpl.getStatisticsDatil(statisticsQo);
        //组织返回报文
        writeCommonDataResponse(response,"200","查询成功",statisticsVoList);
    }
    @GetMapping("getStatisticsByClient")
    public void getStatisticsByClient(HttpServletResponse response, StatisticsQo statisticsQo ) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        //根据条件查询相关统计信息
        List<StatisticsByClientVo> statisticsByClientVos = statisticsServiceimpl.getStatisticsByClient(statisticsQo);
        //组织返回报文
        writeCommonDataResponse(response,"200","查询成功",statisticsByClientVos);
    }




    @GetMapping("exportStatistics")
    public void exportStatistics(HttpServletResponse response, StatisticsQo statisticsQo ) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        //根据条件查询相关统计信息
            List<StatisticsVo> statisticsVoList = statisticsServiceimpl.getStatisticsDatil(statisticsQo);
        //设置导出标题
        String title="泰安朗瑞食品有限公司产品库存表";
        //设置列名称
        String[] rowsName = new String[]{"序号","商品名称","编号","规格","生产日期","入库","出库","退货","库存"};
        //导出数据
        List<Object[]>  dataList = new ArrayList<Object[]>();
        Object[] objs = null;
        for (int i = 0; i < statisticsVoList.size(); i++) {
            StatisticsVo data = statisticsVoList.get(i);
            objs = new Object[rowsName.length];
            objs[0] = i;
            objs[1] = data.getItemName();
            objs[2] = data.getItemNo();
            objs[3] = data.getModels();
            objs[4] = data.getProducedTime();
            objs[5] = data.getInventoryIn();
            objs[6] = data.getInventoryOut();
            objs[7] = data.getInventoryReturn();
            objs[8] = data.getStock();
            dataList.add(objs);
        }
        String fileUrl= "D:/data/按商品/";
        ExportExcel exportExcel = new ExportExcel(title,rowsName,dataList,response,fileUrl);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
