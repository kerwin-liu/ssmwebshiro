package com.kerwin.ssm.business.management.dao;

import com.kerwin.ssm.business.management.model.Email;

import java.util.List;

public interface EmailMapper {
    int deleteByPrimaryKey(String id);

    int insert(Email record);

    int insertSelective(Email record);

    Email selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Email record);

    int updateByPrimaryKey(Email record);

    List<Email> getList();
}