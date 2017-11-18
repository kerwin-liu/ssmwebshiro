package com.kerwin.ssm.business.management.service;

import com.kerwin.ssm.business.management.model.Qo.UserQo;

import javax.xml.registry.infomodel.User;
import java.util.List;

/**
 * Created by Administrator on 2017/11/16.
 */
public interface UserService {
    List<User> getAll(UserQo userQo);
}
