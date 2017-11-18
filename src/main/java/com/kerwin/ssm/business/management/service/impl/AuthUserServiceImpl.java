package com.kerwin.ssm.business.management.service.impl;

import com.kerwin.ssm.business.management.dao.AuthUserMapper;
import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.service.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/27.
 */
@Service
public class AuthUserServiceImpl implements AuthUserService {
    @Autowired
    private AuthUserMapper authUserMapper;

    public AuthUser getAuthUserByName(String userName) {
        return authUserMapper.selectByName(userName);
    }
}
