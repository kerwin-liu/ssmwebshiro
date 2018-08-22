package com.kerwin.ssm.business.management.model.Vo;

/**
 * Created by kerwin.liu on 2018/8/13.
 */
public class StatisticsVo {
    private String id;
    private String itemName;
    private String itemNo;
    private String models;
    private String stock;
    private String producedTime;
    private String status;
    private String inventoryOut;
    private String inventoryReturn;
    private String inventoryIn;

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

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

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getProducedTime() {
        return producedTime;
    }

    public void setProducedTime(String producedTime) {
        this.producedTime = producedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInventoryOut() {
        return inventoryOut;
    }

    public void setInventoryOut(String inventoryOut) {
        this.inventoryOut = inventoryOut;
    }

    public String getInventoryReturn() {
        return inventoryReturn;
    }

    public void setInventoryReturn(String inventoryReturn) {
        this.inventoryReturn = inventoryReturn;
    }

    public String getInventoryIn() {
        return inventoryIn;
    }

    public void setInventoryIn(String inventoryIn) {
        this.inventoryIn = inventoryIn;
    }
}
