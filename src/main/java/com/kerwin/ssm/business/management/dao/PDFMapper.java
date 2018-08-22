package com.kerwin.ssm.business.management.dao;

import com.kerwin.ssm.business.management.model.PDF;
import com.kerwin.ssm.business.management.model.Qo.PDFQo;

import java.util.List;

public interface PDFMapper {
    int deleteByPrimaryKey(String id);

    int insert(PDF record);

    int insertSelective(PDF record);

    PDF selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PDF record);

    int updateByPrimaryKey(PDF record);

    List<PDF> selectByItemQo(PDFQo pdfQo);
}