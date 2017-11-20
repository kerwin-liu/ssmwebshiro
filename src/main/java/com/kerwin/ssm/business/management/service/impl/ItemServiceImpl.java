package com.kerwin.ssm.business.management.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kerwin.ssm.business.management.dao.ItemMapper;
import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Item;
import com.kerwin.ssm.business.management.model.Qo.ItemQo;
import com.kerwin.ssm.business.management.service.ItemService;
import com.kerwin.ssm.common.IDUtils;
import com.kerwin.ssm.common.Pages;
import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.sasl.SaslServer;
import javax.xml.registry.infomodel.User;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kerwin.liu on 2017/11/19.
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;

    public boolean save(Item item, AuthUser authUser) {
        //设置主键id 添加人 id 姓名 时间，现有库存初始化
        item.setId(IDUtils.getId());
        item.setCreatId("111");
        item.setQuantity(new BigDecimal(0));
        ItemQo itemQo = new ItemQo();
        itemQo.setItemNo(item.getItemNo());
        List<Item> itemList = itemMapper.selectPage(itemQo);
        if (itemList.size() > 0) {
            return false;
        }
        return itemMapper.insertSelective(item) > 0;
    }

    public Pages<Item> getPages(ItemQo itemQo) {
        PageHelper.startPage(itemQo.getPageIndex(), itemQo.getPageSize());
        List<Item> itemList = itemMapper.selectByItemQo(itemQo);
        Page<Item> page = (Page<Item>) itemList;
        return new Pages<Item>(page.getStartRow(), page.getTotal(), page.getPageSize(), itemList);
    }
}
