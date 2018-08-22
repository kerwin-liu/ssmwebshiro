package com.kerwin.ssm.business.management.model;

import java.math.BigDecimal;
import java.util.Date;

public class Inventory {
    private String id;

    private String itemId;

    private String pdfId;

    private BigDecimal quantity;

    private BigDecimal taxAmount;

    private BigDecimal price;

    private BigDecimal priceTax;

    private BigDecimal totalPrice;

    private BigDecimal totalPriceTax;

    private BigDecimal stock;

    private Date producedTime;

    private boolean invoiceStatus;

    private BigDecimal remainTaxAmount;

    private BigDecimal remainTotalPrice;

    private BigDecimal remainTotalPriceTax;

    private String remark;

    private String createId;

    private Date createTime;

    private Date lastTime;

    private String byzd1;

    private String byzd2;

    private String byzd3;

    private String byzd4;

    private String byzd5;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getPdfId() {
        return pdfId;
    }

    public void setPdfId(String pdfId) {
        this.pdfId = pdfId == null ? null : pdfId.trim();
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceTax() {
        return priceTax;
    }

    public void setPriceTax(BigDecimal priceTax) {
        this.priceTax = priceTax;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPriceTax() {
        return totalPriceTax;
    }

    public void setTotalPriceTax(BigDecimal totalPriceTax) {
        this.totalPriceTax = totalPriceTax;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public Date getProducedTime() {
        return producedTime;
    }

    public void setProducedTime(Date producedTime) {
        this.producedTime = producedTime;
    }

    public boolean isInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(boolean invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public BigDecimal getRemainTaxAmount() {
        return remainTaxAmount;
    }

    public void setRemainTaxAmount(BigDecimal remainTaxAmount) {
        this.remainTaxAmount = remainTaxAmount;
    }

    public BigDecimal getRemainTotalPrice() {
        return remainTotalPrice;
    }

    public void setRemainTotalPrice(BigDecimal remainTotalPrice) {
        this.remainTotalPrice = remainTotalPrice;
    }

    public BigDecimal getRemainTotalPriceTax() {
        return remainTotalPriceTax;
    }

    public void setRemainTotalPriceTax(BigDecimal remainTotalPriceTax) {
        this.remainTotalPriceTax = remainTotalPriceTax;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getByzd1() {
        return byzd1;
    }

    public void setByzd1(String byzd1) {
        this.byzd1 = byzd1 == null ? null : byzd1.trim();
    }

    public String getByzd2() {
        return byzd2;
    }

    public void setByzd2(String byzd2) {
        this.byzd2 = byzd2 == null ? null : byzd2.trim();
    }

    public String getByzd3() {
        return byzd3;
    }

    public void setByzd3(String byzd3) {
        this.byzd3 = byzd3 == null ? null : byzd3.trim();
    }

    public String getByzd4() {
        return byzd4;
    }

    public void setByzd4(String byzd4) {
        this.byzd4 = byzd4 == null ? null : byzd4.trim();
    }

    public String getByzd5() {
        return byzd5;
    }

    public void setByzd5(String byzd5) {
        this.byzd5 = byzd5 == null ? null : byzd5.trim();
    }
}