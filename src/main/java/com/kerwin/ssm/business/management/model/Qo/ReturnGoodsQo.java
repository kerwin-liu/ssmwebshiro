package com.kerwin.ssm.business.management.model.Qo;

/**
 * Created by kerwin.liu on 2018/2/15.
 */
public class ReturnGoodsQo {
    /**
     * 发货id
     **/
    private String inventoryLogId;
    /**
     * 退货数量
     **/
    private String returnQuantity;
    /**
     * 退货原因
     */
    private String cause;

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getInventoryLogId() {
        return inventoryLogId;
    }

    public void setInventoryLogId(String inventoryLogId) {
        this.inventoryLogId = inventoryLogId;
    }

    public String getReturnQuantity() {
        return returnQuantity;
    }

    public void setReturnQuantity(String returnQuantity) {
        this.returnQuantity = returnQuantity;
    }
}
