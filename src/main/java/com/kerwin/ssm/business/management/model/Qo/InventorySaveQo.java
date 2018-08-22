package com.kerwin.ssm.business.management.model.Qo;

import com.kerwin.ssm.common.DateUtils;

import java.util.Date;

/**
 * Created by kerwin.liu on 2017/12/29.
 */
public class InventorySaveQo {
    private String itemId;

    private String quantity;

    private String taxAmount;

    private String price;

    private String priceTax;

    private String totalPrice;

    private String totalPriceTax;

    private String stock;

    private Date producedTime;

    private String remainTaxAmount;

    private String remainTotalPrice;

    private String remainTotalPriceTax;

    private String remark;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
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

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Date getProducedTime() {
        return producedTime;
    }

    public void setProducedTime(Date producedTime) {
        this.producedTime =DateUtils.strToDate(DateUtils.dateToStr(producedTime));
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
