package com.kerwin.ssm.business.management.controller;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Client;
import com.kerwin.ssm.business.management.model.Email;
import com.kerwin.ssm.business.management.model.Qo.ClientAddressAddQo;
import com.kerwin.ssm.business.management.model.Qo.ClientInsertQo;
import com.kerwin.ssm.business.management.model.Qo.ClientPageQo;
import com.kerwin.ssm.business.management.model.Vo.ClientAddressesVo;
import com.kerwin.ssm.business.management.model.Vo.ClientPageVo;
import com.kerwin.ssm.business.management.service.ClientService;
import com.kerwin.ssm.business.management.service.EmailService;
import com.kerwin.ssm.common.Pages;
import com.kerwin.ssm.common.web.BaseController;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by kerwin.liu on 2018/1/14.
 */
@Controller
@RequestMapping("email")
public class EmailController extends BaseController {
    @Autowired
    private EmailService emailService;
    @PostMapping("save")
    public void save(HttpServletResponse response,  Email email) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        if(null == authUser){
            writeResponse(response,"302","登录超时");
            return;
        }
       boolean save = emailService.save(email);
        if(save){
            writeResponse(response,"200","新增客户成功");
        }else{
            writeResponse(response,"400","该手机号已存在");
        }
    }
    @PostMapping("update")
    public void update(HttpServletResponse response, Email email) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        if(null == authUser){
            writeResponse(response,"302","登录超时");
            return;
        }
        try{
            boolean update = emailService.update(email,authUser);
        }catch (Exception e){
            writeResponse(response,"400","修改客户失败");
        }
        writeResponse(response,"200","修改客户成功");
    }
    @GetMapping("getList")
    public void getList(HttpServletResponse response) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        List<Email> emailList= emailService.getList();
        writeCommonDataResponse(response,"200","查询客户成功",emailList);
    }
    @GetMapping("getOne/{id}")
    public void getOne(HttpServletResponse response, @PathVariable("id") String id) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        if(null == authUser){
            writeResponse(response,"302","登录超时");
            return;
        }
        Email email = emailService.getEmailById(id);
        writeCommonDataResponse(response,"200","查询客户成功",email);
    }
}