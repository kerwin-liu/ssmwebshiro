package com.kerwin.ssm.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by kerwin.liu on 2018/8/20.
 */
public class EmailUtil {
    private static Logger logger = LoggerFactory.getLogger(EmailUtil.class);

    @Autowired
    private JavaMailSender javaMailSender;

    private String fromAddress;

    private String subject;

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void sendEmail(String email, String content,String[] filePath) throws Exception {
        logger.info("发送邮件开始,邮件 : {}",email);
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true,"UTF-8");

        String nick = javax.mail.internet.MimeUtility.encodeText("朗瑞食品有限公司");
        //发送方名称
        messageHelper.setFrom(nick + " <" + fromAddress + ">");
        //接收方邮箱
        messageHelper.setTo(email);
        //邮箱主题
        messageHelper.setSubject(subject);
        //邮箱内容
        messageHelper.setText(content, true);

        //附件
        if(filePath!= null){
            for (String string : filePath) {
                FileSystemResource file = new FileSystemResource(new File(string));
                messageHelper.addAttachment(file.getFilename(), file);
            }
        }
        //异步发送邮件
            try {
                javaMailSender.send(mimeMessage);
            } catch (Exception ex) {
                logger.error("mail sender error ");
            }


    }
}
