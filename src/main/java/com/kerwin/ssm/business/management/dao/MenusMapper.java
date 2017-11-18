package com.kerwin.ssm.business.management.dao;

import com.kerwin.ssm.business.management.model.Menus;

import java.util.List;

public interface MenusMapper {
    int deleteByPrimaryKey(String id);

    int insert(Menus record);

    int insertSelective(Menus record);

    Menus selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Menus record);

    int updateByPrimaryKey(Menus record);

    List<Menus> selectAll();
}