package com.kerwin.ssm.business.management.service;

import com.kerwin.ssm.business.management.model.PDF;
import com.kerwin.ssm.business.management.model.Qo.PDFQo;
import com.kerwin.ssm.common.Pages;

/**
 * Created by kerwin.liu on 2017/12/6.
 */
public interface PdfService {
    boolean save(PDF pdf);

    Pages<PDF> getPages(PDFQo pdfQo);
}
