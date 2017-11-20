package com.kerwin.ssm.business.management.model.Qo;

import com.kerwin.ssm.common.web.BaseQuery;

import java.math.BigDecimal;
import java.util.Date;

public class ItemQo extends BaseQuery{
    private String id;

    private String itemNo;

    private String itemName;

    private String unitName;

    private String rates;

    private String models;

    private String price;

    private BigDecimal warnQuantity;

    private BigDecimal quantity;

    private String creatId;

    private Date creatTime;

    private Date lastTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getRates() {
        return rates;
    }

    public void setRates(String rates) {
        this.rates = rates == null ? null : rates.trim();
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models == null ? null : models.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public BigDecimal getWarnQuantity() {
        return warnQuantity;
    }

    public void setWarnQuantity(BigDecimal warnQuantity) {
        this.warnQuantity = warnQuantity;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getCreatId() {
        return creatId;
    }

    public void setCreatId(String creatId) {
        this.creatId = creatId == null ? null : creatId.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}