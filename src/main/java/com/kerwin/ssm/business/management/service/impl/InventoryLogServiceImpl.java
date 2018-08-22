package com.kerwin.ssm.business.management.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kerwin.ssm.business.management.dao.InventoryLogMapper;
import com.kerwin.ssm.business.management.dao.InventoryMapper;
import com.kerwin.ssm.business.management.dao.ItemMapper;
import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.Inventory;
import com.kerwin.ssm.business.management.model.InventoryLog;
import com.kerwin.ssm.business.management.model.Item;
import com.kerwin.ssm.business.management.model.Qo.InventoryLogDetailQO;
import com.kerwin.ssm.business.management.model.Qo.InventoryLogPageQo;
import com.kerwin.ssm.business.management.model.Qo.InventoryLogQo;
import com.kerwin.ssm.business.management.model.Qo.ReturnGoodsQo;
import com.kerwin.ssm.business.management.model.Vo.InventoryLogPageVo;
import com.kerwin.ssm.business.management.service.InventoryLogService;
import com.kerwin.ssm.common.IDUtils;
import com.kerwin.ssm.common.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by kerwin.liu on 2018/1/29.
 */
@Service
public class InventoryLogServiceImpl implements InventoryLogService {
    @Autowired
    private InventoryLogMapper inventoryLogMapper;
    @Autowired
    private InventoryMapper inventoryMapper;

    @Autowired
    private ItemMapper itemMapper;

    @Override
    @Transactional
    public String saveInventoryLog(InventoryLogQo inventoryLogQo, AuthUser authUser) throws Exception {
        InventoryLog inventoryLog = new InventoryLog();
        Inventory updateInventoryQo = new Inventory();
        //将收货人地址，电话，物流公司，运输单号记录下来
        inventoryLog.setClientAddress(inventoryLogQo.getcAddress());
        inventoryLog.setClientPhone(inventoryLogQo.getcPhone());
        inventoryLog.setTransportCompany(inventoryLogQo.getTransport());
        inventoryLog.setTransportNo(inventoryLogQo.getTransportNo());
        int i = 0;
        for (InventoryLogDetailQO inventoryLogDetailQO : inventoryLogQo.getInventoryLogs()) {
            i = i+1;
            inventoryLog.setId(IDUtils.getId());
            inventoryLog.setClientId(inventoryLogQo.getClientId());
            inventoryLog.setInventoryId(inventoryLogDetailQO.getId());
            inventoryLog.setQuantity(Integer.valueOf(inventoryLogDetailQO.getQuantity()));
            inventoryLog.setStatus("0");
            inventoryLog.setCreateId(authUser.getId());
            updateInventoryQo.setId(inventoryLogDetailQO.getId());
            updateInventoryQo.setStock(new BigDecimal(inventoryLogDetailQO.getStockResult()));
            updateInventoryQo.setRemainTaxAmount(new BigDecimal(inventoryLogDetailQO.getRemainTaxAmount()));
            updateInventoryQo.setRemainTotalPrice(new BigDecimal(inventoryLogDetailQO.getRemainTotalPrice()));
            updateInventoryQo.setRemainTotalPriceTax(new BigDecimal(inventoryLogDetailQO.getRemainTotalPriceTax()));
            Inventory inventory = inventoryMapper.selectByPrimaryKey(inventoryLogDetailQO.getId());
            if (inventory.getStock().intValue() < inventoryLog.getQuantity()) {
                throw new RuntimeException("第"+i+"条商品库存不足，不能继续出库");
            }
            //将库存相应数据更新为出库后的状态
            inventoryMapper.updateByPrimaryKeySelective(updateInventoryQo);
            //将出库记录更新到出入库记录里边去
            inventoryLogMapper.insertSelective(inventoryLog);

            Item item = new Item();
            item.setId(inventory.getItemId());
            item.setQuantity(new BigDecimal(inventoryLog.getQuantity()*(-1)));
            itemMapper.updateQuantityById(item);
        }
        return "";
    }

    @Override
    public Pages<InventoryLogPageVo> getPages(InventoryLogPageQo inventoryLogPageQo) {
        PageHelper.startPage(inventoryLogPageQo.getPageIndex(), inventoryLogPageQo.getPageSize());
        List<InventoryLogPageVo> inventoryVoList = inventoryLogMapper.getPages(inventoryLogPageQo);
        Page<InventoryLogPageVo> page = (Page<InventoryLogPageVo>) inventoryVoList;
        return new Pages<>(page.getStartRow(), page.getTotal(), page.getPageSize(), inventoryVoList);
    }

    @Override
    public InventoryLogPageVo getOne(String id) {
        return inventoryLogMapper.getOne(id);
    }

    @Override
    public String saveInventoryReturn(ReturnGoodsQo returnGoodsQo, AuthUser authUser) {
        //查出出库信息
        InventoryLog inventoryLog  = inventoryLogMapper.selectByPrimaryKey(returnGoodsQo.getInventoryLogId());
        //保存库存日志表
        InventoryLog inventoryLogReturn = new InventoryLog();
        inventoryLogReturn.setId(IDUtils.getId());
        inventoryLogReturn.setInventoryId(inventoryLog.getInventoryId());
        inventoryLogReturn.setInventoryLogId(returnGoodsQo.getInventoryLogId());
        inventoryLogReturn.setQuantity(Integer.valueOf(returnGoodsQo.getReturnQuantity()));
        inventoryLogReturn.setStatus("1");
        inventoryLogReturn.setCause(returnGoodsQo.getCause());
        inventoryLogReturn.setClientPhone(inventoryLog.getClientPhone());
        inventoryLogReturn.setClientAddress(inventoryLog.getClientAddress());
        inventoryLogReturn.setClientId(inventoryLog.getClientId());
        inventoryLogMapper.insertSelective(inventoryLogReturn);
        //更新库存表数据
        int a = inventoryLogMapper.updateInventoryQuantity(inventoryLogReturn);
        //更新商品数据
        int b = inventoryLogMapper.updateItemQuantity(inventoryLogReturn);
        return null;
    }

    @Override
    public List<InventoryLogPageVo>  getList(String id) {
        return inventoryLogMapper.getList(id);
    }
}
