package com.kerwin.ssm.business.management.dao;

import com.kerwin.ssm.business.management.model.Transport;

import java.util.List;

public interface TransportMapper {
    int deleteByPrimaryKey(String id);

    int insert(Transport record);

    int insertSelective(Transport record);

    Transport selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Transport record);

    int updateByPrimaryKey(Transport record);

    List<Transport> getList();
}