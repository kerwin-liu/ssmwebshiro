package com.kerwin.ssm.common;

import com.kerwin.ssm.business.management.dao.EmailMapper;
import com.kerwin.ssm.business.management.dao.ItemMapper;
import com.kerwin.ssm.business.management.model.Email;
import com.kerwin.ssm.business.management.model.Item;
import com.kerwin.ssm.business.management.model.Qo.StatisticsQo;
import com.kerwin.ssm.business.management.model.Vo.StatisticsVo;
import com.kerwin.ssm.business.management.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by kerwin.liu on 2018/8/20.
 */
public class MyJob {
    @Autowired
    EmailUtil emailSendService;
    @Autowired
    EmailMapper emailMapper;
    @Autowired
    StatisticsService statisticsService;

    @Autowired
    ItemMapper itemMapper;
    public void emailTask(){
        String startTime = DateUtils.getStringDateShort();
        Date date = DateUtils.strToDate(startTime);
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        String endTime = DateUtils.getAfterDay(cl);

        //创建查询条件
        StatisticsQo statisticsQo = new StatisticsQo();
        statisticsQo.setEndTime(endTime);
        statisticsQo.setStartTime(startTime);
        //根据条件查询相关统计信息
        List<StatisticsVo> statisticsVoList = statisticsService.getStatisticsDatil(statisticsQo);
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
        List<String> stringList =new ArrayList<>();
        ExportExcel exportExcel = new ExportExcel(title,rowsName,dataList,null,fileUrl);
        try {
            String export = exportExcel.export();
            stringList.add(export);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] strings = new String[stringList.size()];
        stringList.toArray(strings);
        //组装附件地址
        List<Email> emailList = emailMapper.getList();
        List<Item> items = itemMapper.getAlert();
        StringBuffer sb = new StringBuffer();
        sb.append("你好:<br>   截止到").append(endTime).append("为止，需要进货的商品是：<br>");
        for (Item item : items) {
            sb.append(item.getItemNo()+"--").append(item.getItemName())
                    .append("【").append(item.getModels()).append("】,")
                    .append(",预警数量是：").append(item.getWarnQuantity())
                    .append(",现有库存是：").append(item.getQuantity()).append("<br>");
        }
        sb.append("商品出库汇总请看附件");
        for (Email email : emailList) {
            if(null !=email.getEmailAddress()&&"0".equals(email.getStatus())){
                try {
                    emailSendService.sendEmail("504826455@qq.com",sb.toString(), strings);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
