package com.kerwin.ssm.business.management.controller;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Menus;
import com.kerwin.ssm.business.management.model.Qo.UserQo;
import com.kerwin.ssm.business.management.service.MenuService;
import com.kerwin.ssm.common.web.BaseController;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/11/15.
 */
@Controller
public class MenuController extends BaseController{
    @Autowired
    private MenuService menuService;
    /**
     * 查询菜单栏
     */
    @GetMapping("menus")
    public void menus( HttpServletResponse response) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        if(null == authUser){
            writeResponse(response,"302","登录超时");
            return;
        }
     List<Menus> menusList = menuService.getAll();
     writeCommonDataResponse(response,"200","成功",menusList);
    }
}
