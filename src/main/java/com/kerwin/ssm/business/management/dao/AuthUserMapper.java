package com.kerwin.ssm.business.management.dao;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Qo.UserQo;

import javax.xml.registry.infomodel.User;
import java.util.List;

public interface AuthUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(AuthUser record);

    int insertSelective(AuthUser record);

    AuthUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AuthUser record);

    int updateByPrimaryKey(AuthUser record);

    AuthUser selectByName(String userName);

    List<User> getAll(UserQo userQo);
}