package com.kerwin.ssm.business.management.dao;

import com.kerwin.ssm.business.management.model.RolePermissionKey;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(RolePermissionKey key);

    int insert(RolePermissionKey record);

    int insertSelective(RolePermissionKey record);
}