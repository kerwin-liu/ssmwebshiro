package com.kerwin.ssm.business.management.dao;

import com.kerwin.ssm.business.management.model.InventoryLog;
import com.kerwin.ssm.business.management.model.Qo.InventoryLogPageQo;
import com.kerwin.ssm.business.management.model.Vo.InventoryLogPageVo;
import com.kerwin.ssm.common.Pages;

import java.util.List;

public interface InventoryLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(InventoryLog record);

    int insertSelective(InventoryLog record);

    InventoryLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(InventoryLog record);

    int updateByPrimaryKey(InventoryLog record);

    List<InventoryLogPageVo> getPages(InventoryLogPageQo inventoryLogPageQo);

    InventoryLogPageVo getOne(String id);

    List<InventoryLogPageVo> getList(String id);

    int updateInventoryQuantity(InventoryLog inventoryLogReturn);

    int updateItemQuantity(InventoryLog inventoryLogReturn);
}