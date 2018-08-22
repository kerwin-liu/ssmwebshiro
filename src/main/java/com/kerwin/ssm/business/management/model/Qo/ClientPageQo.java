package com.kerwin.ssm.business.management.model.Qo;

import com.kerwin.ssm.common.web.BaseQuery;

/**
 * Created by kerwin.liu on 2018/1/16.
 */
public class ClientPageQo extends BaseQuery{
    private String cName;
    private String cPhone;
    private String cLevel;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public String getcLevel() {
        return cLevel;
    }

    public void setcLevel(String cLevel) {
        this.cLevel = cLevel;
    }
}
