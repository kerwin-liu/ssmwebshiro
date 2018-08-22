package com.kerwin.ssm.business.management.service;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Qo.InventoryLogPageQo;
import com.kerwin.ssm.business.management.model.Qo.InventoryLogQo;
import com.kerwin.ssm.business.management.model.Qo.ReturnGoodsQo;
import com.kerwin.ssm.business.management.model.Vo.InventoryLogPageVo;
import com.kerwin.ssm.common.Pages;

import java.util.List;

/**
 * Created by kerwin.liu on 2018/1/29.
 */
public interface InventoryLogService {
    String saveInventoryLog(InventoryLogQo inventoryLogQo, AuthUser authUser) throws Exception;

    Pages<InventoryLogPageVo> getPages(InventoryLogPageQo inventoryLogPageQo);

    InventoryLogPageVo getOne(String id);

    String saveInventoryReturn(ReturnGoodsQo returnGoodsQo, AuthUser authUser);

    List<InventoryLogPageVo> getList(String id);
}
