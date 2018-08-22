package com.kerwin.ssm.business.management.model.Qo;


import java.util.List;

/**
 * Created by kerwin.liu on 2018/1/29.
 */
public class InventoryLogQo {
    private String clientId;
    private String cAddress;
    private String cPhone;
    private String transport;
    private String transportNo;
    private String remake;

    private List<InventoryLogDetailQO> inventoryLogs;

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getTransportNo() {
        return transportNo;
    }

    public void setTransportNo(String transportNo) {
        this.transportNo = transportNo;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public List<InventoryLogDetailQO> getInventoryLogs() {
        return inventoryLogs;
    }

    public void setInventoryLogs(List<InventoryLogDetailQO> inventoryLogs) {
        this.inventoryLogs = inventoryLogs;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }
}
