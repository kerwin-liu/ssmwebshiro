package com.kerwin.ssm.business.management.controller;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.model.PDF;
import com.kerwin.ssm.business.management.model.Qo.PDFQo;
import com.kerwin.ssm.business.management.service.PdfService;
import com.kerwin.ssm.common.IDUtils;
import com.kerwin.ssm.common.Pages;
import com.kerwin.ssm.common.web.BaseController;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kerwin.liu on 2017/12/2.
 */
@Controller
@RequestMapping("pdf")
public class PdfController extends BaseController {
    private static final String PATH = "\\InvoicePDF";
    @Autowired
    private PdfService pdfService;

    /**
     * 上传电子发票pdf文件
     */
    @PostMapping("upload")
    public void upload(HttpServletRequest request, HttpServletResponse response, PDF pdf) {
        AuthUser user = (AuthUser) SecurityUtils.getSubject().getPrincipal();
        if(null == user){
            writeResponse(response,"302","登录超时");
            return;
        }
        String filePath;
        if (!pdf.getFile().isEmpty()) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");
            String datePath = sdf.format(new Date());
            String filename = pdf.getFile().getOriginalFilename();
            filePath = PATH + datePath + new Date().getTime() + filename;
            File tempFile = new File(filePath);
            if (!tempFile.exists()) {
                tempFile.mkdirs();
                try {
                    pdf.getFile().transferTo(new File(filePath));
                } catch (Exception e) {
                    writeResponse(response, "400", "保存失败，请重新上传");
                    return;
                }
                pdf.setPdfUrl(filePath);
                pdf.setId(IDUtils.getId());
                pdf.setCreateId(user.getId());
                boolean save = pdfService.save(pdf);
            }
        }
    }
    /**
     * 分页查询发票列表
     */
    @GetMapping("getPages")
    public void getList(HttpServletResponse response, PDFQo pdfQo){
        Pages<PDF> itemPage = pdfService.getPages(pdfQo);
        writeCommonDataResponse(response, "200", "查询商品成功", itemPage);
    }
}