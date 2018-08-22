package com.kerwin.ssm.business.management.controller;


import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Transport;
import com.kerwin.ssm.business.management.service.TransportService;
import com.kerwin.ssm.common.web.BaseController;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by kerwin.liu on 2018/6/22.
 */
@Controller
@RequestMapping("transport")
public class TransportController extends BaseController {
    @Autowired
    private TransportService transportService;
    @GetMapping("getList")
    public void getList(HttpServletResponse response) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
       List<Transport> transportList = transportService.getList();
        writeCommonDataResponse(response,"200","查询客户成功",transportList);
    }
}
