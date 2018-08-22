package com.kerwin.ssm.business.management.dao;

import com.kerwin.ssm.business.management.model.Inventory;
import com.kerwin.ssm.business.management.model.Qo.InventoryPageQo;
import com.kerwin.ssm.business.management.model.Vo.InventoryVo;

import java.util.List;

public interface InventoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);

    List<InventoryVo> getPages(InventoryPageQo inventoryPageQo);

    InventoryVo getOne(String id);
}