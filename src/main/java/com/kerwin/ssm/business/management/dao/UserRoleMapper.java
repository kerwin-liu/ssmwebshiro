package com.kerwin.ssm.business.management.dao;

import com.kerwin.ssm.business.management.model.UserRoleKey;

public interface UserRoleMapper {
    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);

    int insertSelective(UserRoleKey record);
}