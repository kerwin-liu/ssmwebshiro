package com.kerwin.ssm.business.management.service.impl;

import com.kerwin.ssm.business.management.dao.AuthUserMapper;
import com.kerwin.ssm.business.management.model.Qo.UserQo;
import com.kerwin.ssm.business.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.registry.infomodel.User;
import java.util.List;

/**
 * Created by Administrator on 2017/11/16.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private AuthUserMapper authUserMapper;
    public List<User> getAll(UserQo userQo) {

        return authUserMapper.getAll(userQo);
    }
}
