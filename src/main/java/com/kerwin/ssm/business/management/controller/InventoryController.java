package com.kerwin.ssm.business.management.controller;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Inventory;
import com.kerwin.ssm.business.management.model.Qo.InventoryPageQo;
import com.kerwin.ssm.business.management.model.Qo.InventoryQo;
import com.kerwin.ssm.business.management.model.Vo.InventoryVo;
import com.kerwin.ssm.business.management.service.InventoryService;
import com.kerwin.ssm.common.Pages;
import com.kerwin.ssm.common.web.BaseController;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by kerwin.liu on 2017/12/29.
 */
@Controller
@RequestMapping("inventory")
public class InventoryController extends BaseController {
    @Autowired
    private InventoryService inventoryService;
    @PostMapping("save")
    public void save(HttpServletResponse response,@RequestBody InventoryQo inventoryQo) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        if(null == authUser){
            writeResponse(response,"302","登录超时");
            return;
        }
        boolean save = inventoryService.saveInventoryList(inventoryQo,authUser);
        if(save){
            writeResponse(response,"200","货物入库成功");
        }else {
            writeResponse(response,"400","货物入库失败");
        }
    }
    @GetMapping("getPages")
    public void getPages(HttpServletResponse response, InventoryPageQo inventoryPageQo) {
        Pages<InventoryVo> pages = inventoryService.getPages(inventoryPageQo);
        writeCommonDataResponse(response,"200","查询成功",pages);
    }
    @GetMapping("getOne/{id}")
    public void getOne(HttpServletResponse response, @PathVariable("id") String id) {
        InventoryVo inventoryVo = inventoryService.getOneById(id);
        writeCommonDataResponse(response,"200","查询成功",inventoryVo);
    }
}
