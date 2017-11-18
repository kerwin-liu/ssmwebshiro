package com.kerwin.ssm.business.management.service;

import com.kerwin.ssm.business.management.model.AuthUser;

/**
 * Created by Administrator on 2017/10/27.
 */
public interface AuthUserService {
    public AuthUser getAuthUserByName(String userName);
}