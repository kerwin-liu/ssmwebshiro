package com.kerwin.ssm.business.management.controller;

import com.kerwin.ssm.business.management.model.Qo.UserQo;
import com.kerwin.ssm.business.management.service.UserService;
import com.kerwin.ssm.common.web.BaseController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.registry.infomodel.User;
import java.util.List;

/**
 * Created by Administrator on 2017/10/20.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {
    private static Logger log = LogManager.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @PostMapping("save")
    public void save(HttpServletRequest request, HttpServletResponse response, UserQo userQo) {
        System.out.println("123456");
    }

    /**
     * 查询用户列表
     */
    public void save(HttpServletResponse response, UserQo userQo) {
        List<User> userList= userService.getAll(userQo);
    }
}
