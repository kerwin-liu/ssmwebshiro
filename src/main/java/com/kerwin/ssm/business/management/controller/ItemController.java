package com.kerwin.ssm.business.management.controller;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Item;
import com.kerwin.ssm.business.management.model.Qo.ClientAddressAddQo;
import com.kerwin.ssm.business.management.model.Qo.ItemQo;
import com.kerwin.ssm.business.management.model.Vo.ItemVo;
import com.kerwin.ssm.business.management.service.ItemService;
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
import java.util.Objects;

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
        if(null == authUser){
            writeResponse(response,"302","登录超时");
            return;
        }
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
    @GetMapping("getPages")
    public void getPages(HttpServletResponse response, ItemQo itemQo) {
        Pages<Item> itemPage = itemService.getPages(itemQo);
        writeCommonDataResponse(response, "200", "查询商品成功", itemPage);
    }
    /**
     * 查询所有商品
     */
    @GetMapping("getAll")
    public void getAll(HttpServletResponse response, ItemQo itemQo) {
        List<Item> itemList = itemService.getByItemQo(itemQo);
        writeCommonDataResponse(response, "200", "查询商品成功", itemList);
    }

    /**
     * 查询单个商品
     */
    @GetMapping("getOne/{id}")
    public void getPages(HttpServletResponse response, @PathVariable("id") String id) {
        ItemVo itemVo = itemService.getOne(id);
        if(Objects.nonNull(itemVo)){
            writeCommonDataResponse(response, "200", "查询商品成功", itemVo);
        }else{
            writeResponse(response, "400", "查询商品失败");
        }
    }

    /**
     * 删除商品
     */
    @PostMapping("delete/{id}")
    public void delete(HttpServletResponse response, @PathVariable("id") String id) {
        boolean delete = itemService.deleteById(id);
        if (delete) {
            writeResponse(response, "200", "商品删除成功");
        } else {
            writeResponse(response, "400", "商品删除失败");
        }
    }

    /**
     * 修改商品
     */
    @PostMapping("update")
    public void update(HttpServletResponse response, Item item) {
        boolean update = itemService.update(item);
        if (update) {
            writeResponse(response, "200", "商品修改成功");
        } else {
            writeResponse(response, "400", "商品修改失败");
        }
    }
}
