package com.kerwin.ssm.business.management.dao;

import com.kerwin.ssm.business.management.model.Item;
import com.kerwin.ssm.business.management.model.Qo.ItemQo;

import java.util.List;

public interface ItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

    List<Item> selectPage(ItemQo itemQo);

    List<Item> selectByItemQo(ItemQo itemQo);
}