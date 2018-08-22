package com.kerwin.ssm.business.management.model.Qo;

import java.util.List;

/**
 * Created by kerwin.liu on 2017/12/29.
 */
public class InventoryQo {
    private String pdfId;

    private List<InventorySaveQo> inventories;

    public String getPdfId() {
        return pdfId;
    }

    public void setPdfId(String pdfId) {
        this.pdfId = pdfId;
    }

    public List<InventorySaveQo> getInventories() {
        return inventories;
    }

    public void setInventories(List<InventorySaveQo> inventories) {
        this.inventories = inventories;
    }
}
