package com.kerwin.ssm.business.management.controller;

import com.github.pagehelper.Page;
import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Item;
import com.kerwin.ssm.business.management.model.Qo.ItemQo;
import com.kerwin.ssm.business.management.service.ItemService;
import com.kerwin.ssm.common.Pages;
import com.kerwin.ssm.common.web.BaseController;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by kerwin.liu on 2017/11/19.
 */
@Controller
@RequestMapping("item")
public class ItemController extends BaseController {
    @Autowired
    private ItemService itemService;

    /**
     * 增加商品
     */
    @PostMapping("save")
    public void save(HttpServletResponse response, Item item) {
        AuthUser authUser = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        boolean save = itemService.save(item, authUser);
        if (save) {
            writeResponse(response, "200", "商品添加成功");
        } else {
            writeResponse(response, "400", "商品添加失败：商品编号重复");
        }
    }

    /**
     * 分页查询商品
     */
    @PostMapping("getPages")
    public void getPages(HttpServletResponse response, ItemQo itemQo) {
        Pages<Item> itemPage = itemService.getPages(itemQo);
    }
}
