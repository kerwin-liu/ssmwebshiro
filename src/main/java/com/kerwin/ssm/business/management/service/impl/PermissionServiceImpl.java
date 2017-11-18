package com.kerwin.ssm.business.management.service.impl;

import com.kerwin.ssm.business.management.dao.PermissionMapper;
import com.kerwin.ssm.business.management.model.Permission;
import com.kerwin.ssm.business.management.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/1.
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;
    public List<Permission> selectPermissionAll() {
        return permissionMapper.selectAll();
    }
}
