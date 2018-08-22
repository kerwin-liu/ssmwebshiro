package com.kerwin.ssm.business.management.service;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Qo.InventoryPageQo;
import com.kerwin.ssm.business.management.model.Qo.InventoryQo;
import com.kerwin.ssm.business.management.model.Vo.InventoryVo;
import com.kerwin.ssm.common.Pages;

/**
 * Created by kerwin.liu on 2017/12/30.
 */
public interface InventoryService {
    boolean saveInventoryList(InventoryQo inventoryQo, AuthUser authUser);

    Pages<InventoryVo> getPages(InventoryPageQo inventoryPageQo);

    InventoryVo getOneById(String id);
}
