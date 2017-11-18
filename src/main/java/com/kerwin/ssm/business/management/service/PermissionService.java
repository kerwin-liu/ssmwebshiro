package com.kerwin.ssm.business.management.service;

import com.kerwin.ssm.business.management.model.Permission;

import java.util.List;

/**
 * Created by Administrator on 2017/11/1.
 */
public interface PermissionService {
    List<Permission> selectPermissionAll();

}
