package com.kerwin.ssm.business.management.service.impl;

import com.kerwin.ssm.business.management.dao.EmailMapper;
import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Email;
import com.kerwin.ssm.business.management.service.EmailService;
import com.kerwin.ssm.common.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kerwin.liu on 2018/8/20.
 */
@Service
public class EmailServiceImpl implements EmailService{
    @Autowired
    EmailMapper emailMapper;
    @Override
    public boolean save(Email email) {
        email.setId(IDUtils.getId());
        return emailMapper.insertSelective(email) > 0;
    }

    @Override
    public boolean update(Email email, AuthUser authUser) {
        return emailMapper.updateByPrimaryKeySelective(email) > 0;
    }

    @Override
    public List<Email> getList() {
        return emailMapper.getList();
    }

    @Override
    public Email getEmailById(String id) {
        return emailMapper.selectByPrimaryKey(id);
    }
}
