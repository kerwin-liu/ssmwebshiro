package com.kerwin.ssm.business.management.model.Qo;

import com.kerwin.ssm.common.web.BaseQuery;

/**
 * Created by kerwin.liu on 2017/12/6.
 */
public class PDFQo extends BaseQuery {
    private String id;

    private String pdfUrl;

    private String invoiceCode;

    private String invoiceNo;

    private String creatId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getCreatId() {
        return creatId;
    }

    public void setCreatId(String creatId) {
        this.creatId = creatId;
    }
}
