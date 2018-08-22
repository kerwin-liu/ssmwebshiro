package com.kerwin.ssm.business.management.service;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Email;

import java.util.List;

/**
 * Created by kerwin.liu on 2018/8/20.
 */
public interface EmailService {
    boolean save(Email email);

    boolean update(Email email, AuthUser authUser);

    List<Email> getList();

    Email getEmailById(String id);
}
