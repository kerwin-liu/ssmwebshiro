package com.kerwin.ssm.business.management.controller;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Client;
import com.kerwin.ssm.business.management.model.Qo.ClientAddressAddQo;
import com.kerwin.ssm.business.management.model.Qo.ClientInsertQo;
import com.kerwin.ssm.business.management.model.Qo.ClientPageQo;
import com.kerwin.ssm.business.management.model.Vo.ClientAddressesVo;
import com.kerwin.ssm.business.management.model.Vo.ClientPageVo;
import com.kerwin.ssm.business.management.service.ClientService;
import com.kerwin.ssm.common.Pages;
import com.kerwin.ssm.common.web.BaseController;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by kerwin.liu on 2018/1/14.
 */
@Controller
@RequestMapping("client")
public class ClientController extends BaseController {
    @Autowired
    private ClientService clientService;
    @PostMapping("save")
    public void save(HttpServletResponse response, ClientInsertQo clientInsertQo) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        if(null == authUser){
            writeResponse(response,"302","登录超时");
            return;
        }
        boolean save = clientService.saveClient(clientInsertQo,authUser);
        if(save){
            writeResponse(response,"200","新增客户成功");
        }else{
            writeResponse(response,"400","该手机号已存在");
        }
    }
    @PostMapping("saveAddress")
    public void saveAddress(HttpServletResponse response,ClientAddressAddQo clientAddressAddQo) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        boolean save = clientService.saveClientAddress(clientAddressAddQo,authUser);
        if(save){
            writeResponse(response,"200","新增客户地址成功");
        }else{
            writeResponse(response,"400","新增客户地址失败");
        }
    }
    @PostMapping("update")
    public void update(HttpServletResponse response, ClientInsertQo clientInsertQo) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        if(null == authUser){
            writeResponse(response,"302","登录超时");
            return;
        }
        try{
            boolean update = clientService.updateClient(clientInsertQo,authUser);
        }catch (Exception e){
            writeResponse(response,"400","该手机号已存在");
        }
        writeResponse(response,"200","修改客户成功");
    }
    @GetMapping("getPage")
    public void getPage(HttpServletResponse response,  ClientPageQo clientPageQo) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        Pages<ClientPageVo> page= clientService.getClientPage(clientPageQo);
        writeCommonDataResponse(response,"200","查询客户成功",page);
    }
    @GetMapping("getOne/{id}")
    public void getOne(HttpServletResponse response, @PathVariable("id") String id) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        if(null == authUser){
            writeResponse(response,"302","登录超时");
            return;
        }
        Client client = clientService.getClientById(id);
        writeCommonDataResponse(response,"200","查询客户成功",client);
    }
    @GetMapping("getAddress/{id}")
    public void getAddress(HttpServletResponse response,  @PathVariable("id") String id) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        List<ClientAddressesVo> page= clientService.getAddress(id);
        writeCommonDataResponse(response,"200","查询客户成功",page);
    }
}