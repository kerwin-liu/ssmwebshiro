package com.kerwin.ssm.common.web;

import com.kerwin.ssm.common.enums.CodeEnum;
import com.kerwin.ssm.common.enums.MsgEnum;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.crypto.MacSpi;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/27.
 */
@Controller
public class BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);
    private static String RESPCODE = "code";
    private static String RESPMSG = "msg";
    private static String RESPDATE = "data";

    protected void writeResponse(HttpServletResponse response, String code, String msg) {
        response.setContentType("application/json;charset=UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        final String mapCode = code;
        final String mapMsg = msg;
        try {
            mapper.writeValue(response.getWriter(), new HashMap<String, String>() {
                {
                    put(RESPCODE, mapCode);
                    put(RESPMSG, mapMsg);
                }
            });
        } catch (Exception e) {
            writeFatalFailureResponse(response);
            e.printStackTrace();
        }

    }

    protected void writeCommonDataResponse(HttpServletResponse response, String code, String msg, Object object) {
        response.setContentType("application/json;charset=UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        final String mapCode = code;
        final String mapMsg = msg;
        final Object mapObject = object;
        try {
            mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
            mapper.writeValue(response.getWriter(), new HashMap<String, Object>() {
                {
                    put(RESPCODE, mapCode);
                    put(RESPMSG, mapMsg);
                    put(RESPDATE, mapObject);
                }
            });
        } catch (Exception e) {
            writeFatalFailureResponse(response);
            e.printStackTrace();
        }
    }

    protected void writeCommonResponse(HttpServletResponse response, Map<String, Object> data) {
        response.setContentType("application/json;charset=UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        final Map<String, Object> mapData= data;
        try {
            mapper.writeValue(response.getWriter(), mapData);
        } catch (Exception e) {
            writeFatalFailureResponse(response);
            e.printStackTrace();
        }

    }

    protected void writeFatalFailureResponse(HttpServletResponse response) {
        writeResponse(response, CodeEnum.CODE500.getCode(), MsgEnum.WZ_ERROR.getMsg());
    }


}
