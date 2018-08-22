package com.kerwin.ssm.business.management.model.Qo;

import com.kerwin.ssm.common.web.BaseQuery;

/**
 * Created by kerwin.liu on 2017/12/31.
 */
public class InventoryPageQo extends BaseQuery {
    private String itemId;
    private String itemName;
    private String userName;
    private String startTime;
    private String endTime;
    private Boolean stockType;

    public Boolean getStockType() {
        return stockType;
    }

    public void setStockType(Boolean stockType) {
        this.stockType = stockType;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
