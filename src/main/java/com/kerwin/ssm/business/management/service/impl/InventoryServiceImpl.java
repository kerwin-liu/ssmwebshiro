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
import com.kerwin.ssm.business.management.model.Qo.InventoryPageQo;
import com.kerwin.ssm.business.management.model.Qo.InventoryQo;
import com.kerwin.ssm.business.management.model.Qo.InventorySaveQo;
import com.kerwin.ssm.business.management.model.Vo.InventoryVo;
import com.kerwin.ssm.business.management.service.InventoryService;
import com.kerwin.ssm.common.IDUtils;
import com.kerwin.ssm.common.Pages;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by kerwin.liu on 2017/12/30.
 */
@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryMapper inventoryMapper;

    @Autowired
    private InventoryLogMapper inventoryLogMapper;

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public boolean saveInventoryList(InventoryQo inventoryQo, AuthUser authUser) {
        //处理数据
        Inventory inventory = new Inventory();
        if (StringUtils.isNotEmpty(inventoryQo.getPdfId())) {
            //发票id
            inventory.setPdfId(inventoryQo.getPdfId());
            //是否存在发票
            inventory.setInvoiceStatus(true);
        } else {
            inventory.setInvoiceStatus(false);
        }
        try {
            for (InventorySaveQo inventorySaveQo : inventoryQo.getInventories()) {
                //主键
                inventory.setId(IDUtils.getId());
                inventory.setItemId(inventorySaveQo.getItemId());
                //数量
                inventory.setQuantity(new BigDecimal(inventorySaveQo.getQuantity()));
                //税额
                inventory.setTaxAmount(new BigDecimal(inventorySaveQo.getTaxAmount()));
                //不含税单价
                inventory.setPrice(new BigDecimal(inventorySaveQo.getPrice()));
                //含税单价
                inventory.setPriceTax(new BigDecimal(inventorySaveQo.getPriceTax()));
                //不含税金额
                inventory.setTotalPrice(new BigDecimal(inventorySaveQo.getTotalPrice()));
                //价税合计金额
                inventory.setTotalPriceTax(new BigDecimal(inventorySaveQo.getTotalPriceTax()));
                //库存数量初始化为数量
                inventory.setStock(new BigDecimal(inventorySaveQo.getQuantity()));
                //生产日期
                inventory.setProducedTime(inventorySaveQo.getProducedTime());
                //剩余税额、金额、价税合计
                inventory.setRemainTaxAmount(new BigDecimal(inventorySaveQo.getTaxAmount()));
                inventory.setRemainTotalPrice(new BigDecimal(inventorySaveQo.getTotalPrice()));
                inventory.setRemainTotalPriceTax(new BigDecimal(inventorySaveQo.getTotalPriceTax()));
                //入库人
                inventory.setCreateId(authUser.getId());
                inventoryMapper.insertSelective(inventory);
                //商品表增加库存数量
                Item item = new Item();
                item.setId(inventory.getItemId());
                item.setQuantity(inventory.getQuantity());
                itemMapper.updateQuantityById(item);
                //加入库存日志表
                InventoryLog inventoryLog = new InventoryLog();
                inventoryLog.setId(IDUtils.getId());
                inventoryLog.setInventoryId(inventory.getId());
                inventoryLog.setQuantity(inventory.getQuantity().intValue());
                inventoryLog.setStatus("2");
                inventoryLogMapper.insertSelective(inventoryLog);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public Pages<InventoryVo> getPages(InventoryPageQo inventoryPageQo) {
        PageHelper.startPage(inventoryPageQo.getPageIndex(), inventoryPageQo.getPageSize());
        List<InventoryVo> inventoryVoList = inventoryMapper.getPages(inventoryPageQo);
        Page<InventoryVo> page = (Page<InventoryVo>) inventoryVoList;
        return new Pages<>(page.getStartRow(), page.getTotal(), page.getPageSize(), inventoryVoList);
    }

    @Override
    public InventoryVo getOneById(String id) {
        InventoryVo inventoryVo = inventoryMapper.getOne(id);
        return inventoryVo;
    }
}
