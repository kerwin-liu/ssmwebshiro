package com.kerwin.ssm.business.management.model.Qo;

/**
 * Created by kerwin.liu on 2018/1/29.
 */
public class InventoryLogDetailQO {
    private String id;
    private String itemName;
    private String models;
    private String quantity;
    private String unitName;
    private String priceTax;
    private String price;
    private String totalPrice;
    private String rates;
    private String taxAmount;
    private String totalPriceTax;
    private String stockResult;
    private String remainTaxAmount;
    private String remainTotalPrice;
    private String remainTotalPriceTax;

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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getPriceTax() {
        return priceTax;
    }

    public void setPriceTax(String priceTax) {
        this.priceTax = priceTax;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRates() {
        return rates;
    }

    public void setRates(String rates) {
        this.rates = rates;
    }

    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getTotalPriceTax() {
        return totalPriceTax;
    }

    public void setTotalPriceTax(String totalPriceTax) {
        this.totalPriceTax = totalPriceTax;
    }

    public String getStockResult() {
        return stockResult;
    }

    public void setStockResult(String stockResult) {
        this.stockResult = stockResult;
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
}
