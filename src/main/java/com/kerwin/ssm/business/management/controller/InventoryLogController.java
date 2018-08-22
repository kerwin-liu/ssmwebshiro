package com.kerwin.ssm.business.management.controller;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Qo.InventoryLogPageQo;
import com.kerwin.ssm.business.management.model.Qo.InventoryLogQo;
import com.kerwin.ssm.business.management.model.Qo.InventoryPageQo;
import com.kerwin.ssm.business.management.model.Qo.ReturnGoodsQo;
import com.kerwin.ssm.business.management.model.Vo.InventoryLogPageVo;
import com.kerwin.ssm.business.management.service.InventoryLogService;
import com.kerwin.ssm.common.Pages;
import com.kerwin.ssm.common.web.BaseController;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by kerwin.liu on 2018/1/28.
 */
@Controller
@RequestMapping("inventoryLog")
public class InventoryLogController extends BaseController{
    @Autowired
    private InventoryLogService inventoryLogService;
    @PostMapping("save")
    public void save(HttpServletResponse response, @RequestBody InventoryLogQo inventoryLogQo) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        String message = null;
        if(null == authUser){
            writeResponse(response,"302","登录超时");
            return;
        }
        try {
            message = inventoryLogService.saveInventoryLog(inventoryLogQo,authUser);
        } catch (Exception e) {
            message = e.getMessage();
        }
        if("".equals(message)){
            writeResponse(response,"200","货物出库成功");
        } else {
            writeResponse(response,"400",message);
        }
    }
    @GetMapping("getPages")
    public void getPages(HttpServletResponse response, InventoryLogPageQo inventoryLogPageQo) {
        Pages<InventoryLogPageVo> pages = inventoryLogService.getPages(inventoryLogPageQo);
        writeCommonDataResponse(response,"200","查询成功",pages);
    }
    @GetMapping("getList/{id}")
    public void getList(HttpServletResponse response,  @PathVariable("id") String id) {
        List<InventoryLogPageVo> inventoryVoList= inventoryLogService.getList(id);
        writeCommonDataResponse(response,"200","查询成功",inventoryVoList);
    }
    @GetMapping("getOne/{id}")
    public void getOne(HttpServletResponse response,  @PathVariable("id") String id) {
        InventoryLogPageVo inventoryLogPageVo = inventoryLogService.getOne(id);
        writeCommonDataResponse(response,"200","查询成功",inventoryLogPageVo);
    }
    @PostMapping("returnGoods")
    public void returnGoods(HttpServletResponse response, @RequestBody ReturnGoodsQo returnGoodsQo) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        if(null == authUser){
            writeResponse(response,"302","登录超时");
            return;
        }
        String message = null;
        try {
            message = inventoryLogService.saveInventoryReturn(returnGoodsQo,authUser);
        } catch (Exception e) {
            message = e.getMessage();
            writeCommonDataResponse(response,"500","退货失败",message);
        }
        writeResponse(response,"200","货物退货成功");
    }
}
