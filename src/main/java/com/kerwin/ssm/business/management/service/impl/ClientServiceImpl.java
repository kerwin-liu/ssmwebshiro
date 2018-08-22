package com.kerwin.ssm.business.management.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kerwin.ssm.business.management.dao.ClientAddressMapper;
import com.kerwin.ssm.business.management.dao.ClientMapper;
import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Client;
import com.kerwin.ssm.business.management.model.ClientAddress;
import com.kerwin.ssm.business.management.model.Qo.ClientAddressAddQo;
import com.kerwin.ssm.business.management.model.Qo.ClientInsertQo;
import com.kerwin.ssm.business.management.model.Qo.ClientPageQo;
import com.kerwin.ssm.business.management.model.Vo.ClientAddressesVo;
import com.kerwin.ssm.business.management.model.Vo.ClientPageVo;
import com.kerwin.ssm.business.management.service.ClientService;
import com.kerwin.ssm.common.IDUtils;
import com.kerwin.ssm.common.Pages;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.misc.Cleaner;

import java.util.List;

/**
 * Created by kerwin.liu on 2018/1/14.
 */
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientMapper clientMapper;

    @Autowired
    private ClientAddressMapper clientAddressMapper;
    @Override
    public boolean saveClient(ClientInsertQo clientInsertQo, AuthUser authUser) {
        Client client = new Client();
        BeanUtils.copyProperties(clientInsertQo, client);
        client.setId(IDUtils.getId());
        client.setCreateUserId(authUser.getId());
        Integer i = 0;
        try{
             i = clientMapper.insertSelective(client);
        }catch (Exception e){
        }
        return i > 0;
    }

    @Override
    public Pages<ClientPageVo> getClientPage(ClientPageQo clientPageQo) {
        PageHelper.startPage(clientPageQo.getPageIndex(),clientPageQo.getPageSize());
        List<ClientPageVo> clientPageVoList = clientMapper.getClientPage(clientPageQo);
        Page<ClientPageVo> page = (Page<ClientPageVo>) clientPageVoList;
        return new Pages<>(page.getStartRow(), page.getTotal(), page.getPageSize(), clientPageVoList);
    }

    @Override
    public boolean updateClient(ClientInsertQo clientInsertQo, AuthUser authUser) {
        Client client = new Client();
        BeanUtils.copyProperties(clientInsertQo, client);
        int i = clientMapper.updateByPrimaryKeySelective(client);
        return i > 0;
    }

    @Override
    public Client getClientById(String id) {
        return clientMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ClientAddressesVo> getAddress(String id) {
        return clientMapper.getAddress(id);
    }

    @Override
    public boolean saveClientAddress(ClientAddressAddQo clientAddressAddQo, AuthUser authUser) {
        ClientAddress clientAddress = new ClientAddress();
        clientAddress.setId(IDUtils.getId());
        clientAddress.setClientId(clientAddressAddQo.getClientId());
        clientAddress.setAddress(clientAddressAddQo.getAddress());
        return clientAddressMapper.insertSelective(clientAddress) >0;
    }
}
