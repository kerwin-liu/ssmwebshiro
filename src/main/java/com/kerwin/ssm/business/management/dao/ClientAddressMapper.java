package com.kerwin.ssm.business.management.dao;

import com.kerwin.ssm.business.management.model.ClientAddress;

public interface ClientAddressMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClientAddress record);

    int insertSelective(ClientAddress record);

    ClientAddress selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClientAddress record);

    int updateByPrimaryKey(ClientAddress record);
}