package com.kerwin.ssm.business.management.service;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Client;
import com.kerwin.ssm.business.management.model.Qo.ClientAddressAddQo;
import com.kerwin.ssm.business.management.model.Qo.ClientInsertQo;
import com.kerwin.ssm.business.management.model.Qo.ClientPageQo;
import com.kerwin.ssm.business.management.model.Vo.ClientAddressesVo;
import com.kerwin.ssm.business.management.model.Vo.ClientPageVo;
import com.kerwin.ssm.common.Pages;

import java.util.List;

/**
 * Created by kerwin.liu on 2018/1/14.
 */
public interface ClientService {
    boolean saveClient(ClientInsertQo clientInsertQo, AuthUser authUser);

    Pages<ClientPageVo> getClientPage(ClientPageQo clientPageQo);

    boolean updateClient(ClientInsertQo clientInsertQo, AuthUser authUser);

    Client getClientById(String id);

    List<ClientAddressesVo> getAddress(String id);

    boolean saveClientAddress(ClientAddressAddQo clientAddressAddQo, AuthUser authUser);
}
