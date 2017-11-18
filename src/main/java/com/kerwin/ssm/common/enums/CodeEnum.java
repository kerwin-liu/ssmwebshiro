package com.kerwin.ssm.common.enums;

/**
 * Created by Administrator on 2017/10/30.
 */
public enum CodeEnum {
    CODE200("200"),
    CODE201("201"),
    CODE300("300"),
    CODE301("301"),
    CODE400("400"),
    CODE401("401"),
    CODE402("402"),
    CODE403("403"),
    CODE404("404"),
    CODE500("500");
    private String code;

    CodeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
