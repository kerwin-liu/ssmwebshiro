package com.kerwin.ssm.common.enums;

/**
 * Created by Administrator on 2017/10/30.
 */
public enum MsgEnum {
    SELECT_SECCUSS("查询成功"),
    SELECT_FALSE("查询失败"),
    INSERT_SECCUSS("保存成功"),
    INSERT_FALSE("保存失败"),
    DElETE_SECCUSS("删除成功"),
    DElETE_FALSE("删除失败"),
    UPDATE_SECCUSS("修改成功"),
    UPDATE_FALSE("修改失败"),
    WZ_ERROR("未知异常");
    private String msg;

    MsgEnum(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
