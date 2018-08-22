package com.kerwin.ssm.business.management.model.Vo;

import java.math.BigDecimal;

/**
 * Created by kerwin.liu on 2017/12/31.
 */
public class InventoryVo {
    /**
     * 主键id
     */
    private String id;
    /**
     * 商品名称
     */
    private String itemName;
    /**
     * 入库数量
     */
    private String  quantity;
    /**
     * 剩余库存
     */
    private BigDecimal stock;
    /**
     * 入库时间
     */
    private String createTime;
    /**
     * 生产时间
     */
    private String producedTime;
    /**
     * 商品规格
     */
    private String models;
    /**
     * 商品单位
     */
    private String unitName;
    /**
     * 税率
     */
    private String rates;
    /**
     * 不含税单价
     */
    private String price;
    /**
     * 含税单价
     */
    private String priceTax;
    /**
     * 不含税金额
     */
    private String totalPrice;
    /**
     * 税额
     */
    private String taxAmount;
    /**
     * 价税合计金额
     */
    private String totalPriceTax;
    /**
     * 剩余税额
     */
    private String remainTaxAmount;
    /**
     * 剩余金额
     */
    private String remainTotalPrice;
    /**
     * 剩余价税合计金额
     */
    private String remainTotalPriceTax;
    /**
     * 入库人
     */
    private String userName;
    private BigDecimal warnQuantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getRates() {
        return rates;
    }

    public void setRates(String rates) {
        this.rates = rates;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceTax() {
        return priceTax;
    }

    public void setPriceTax(String priceTax) {
        this.priceTax = priceTax;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTotalPriceTax() {
        return totalPriceTax;
    }

    public void setTotalPriceTax(String totalPriceTax) {
        this.totalPriceTax = totalPriceTax;
    }

    public String getRemainTaxAmount() {
        return remainTaxAmount;
    }

    public void setRemainTaxAmount(String remainTaxAmount) {
        this.remainTaxAmount = remainTaxAmount;
    }

    public String getRemainTotalPrice() {
        return remainTotalPrice;
    }

    public void setRemainTotalPrice(String remainTotalPrice) {
        this.remainTotalPrice = remainTotalPrice;
    }

    public String getRemainTotalPriceTax() {
        return remainTotalPriceTax;
    }

    public void setRemainTotalPriceTax(String remainTotalPriceTax) {
        this.remainTotalPriceTax = remainTotalPriceTax;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime.replace(".0","");
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getWarnQuantity() {
        return warnQuantity;
    }

    public void setWarnQuantity(BigDecimal warnQuantity) {
        this.warnQuantity = warnQuantity;
    }

    public String getProducedTime() {
        return producedTime;
    }

    public void setProducedTime(String producedTime) {
        this.producedTime = producedTime.substring(0,10);
    }
}
