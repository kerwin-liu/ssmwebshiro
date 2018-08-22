package com.kerwin.ssm.business.management.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kerwin.ssm.business.management.dao.PDFMapper;
import com.kerwin.ssm.business.management.model.PDF;
import com.kerwin.ssm.business.management.model.Qo.PDFQo;
import com.kerwin.ssm.business.management.service.PdfService;
import com.kerwin.ssm.common.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kerwin.liu on 2017/12/6.
 */
@Service
public class PdfServiceImpl implements PdfService {
    @Autowired
    private PDFMapper pdfMapper;

    @Override
    public boolean save(PDF pdf) {
        return pdfMapper.insertSelective(pdf) > 0;
    }

    @Override
    public Pages<PDF> getPages(PDFQo pdfQo) {
        PageHelper.startPage(pdfQo.getPageIndex(), pdfQo.getPageSize());
        List<PDF> itemList = pdfMapper.selectByItemQo(pdfQo);
        Page<PDF> page = (Page<PDF>) itemList;
        return new Pages<PDF>(page.getStartRow(), page.getTotal(), page.getPageSize(), itemList);
    }
}
