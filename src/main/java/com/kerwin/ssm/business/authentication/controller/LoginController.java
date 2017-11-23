package com.kerwin.ssm.business.authentication.controller;

import com.kerwin.ssm.business.management.model.Qo.UserQo;
import com.kerwin.ssm.common.web.BaseController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/10/20.
 */
@Controller
public class LoginController extends BaseController {
    private static Logger log = LogManager.getLogger(LoginController.class);

    /**
     * 登录
     */
    @RequestMapping("login")
    public void login(HttpServletRequest request, HttpServletResponse response, UserQo userQo) {
        log.debug("登录请求参数{}", userQo.toString());
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userQo.getUserName(), userQo.getPassword());
        try {
            subject.login(token);
        } catch (Exception e) {
            log.error("账号不存在或密码不正确");
            writeResponse(response, "302", "登录失败");
            return;
        }
        writeResponse(response, "200", "登录成功");
    }



}
