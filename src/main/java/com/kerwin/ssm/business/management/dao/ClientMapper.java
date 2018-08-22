package com.kerwin.ssm.business.management.dao;

import com.kerwin.ssm.business.management.model.Client;
import com.kerwin.ssm.business.management.model.Qo.ClientPageQo;
import com.kerwin.ssm.business.management.model.Vo.ClientAddressesVo;
import com.kerwin.ssm.business.management.model.Vo.ClientPageVo;
import com.kerwin.ssm.common.Pages;

import java.util.List;

public interface ClientMapper {
    int deleteByPrimaryKey(String id);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);

    List<ClientPageVo> getClientPage(ClientPageQo clientPageQo);

    List<ClientAddressesVo> getAddress(String id);
}