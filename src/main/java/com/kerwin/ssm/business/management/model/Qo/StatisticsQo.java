package com.kerwin.ssm.business.management.model.Qo;

import java.util.Date;

/**
 * Created by kerwin.liu on 2018/8/13.
 */
public class StatisticsQo {
    public String dateType;
    public String startTime;
    public Date startTimeD;
    public String endTime;
    public Date endTimeD;

    public Date getStartTimeD() {
        return startTimeD;
    }

    public void setStartTimeD(Date startTimeD) {
        this.startTimeD = startTimeD;
    }

    public Date getEndTimeD() {
        return endTimeD;
    }

    public void setEndTimeD(Date endTimeD) {
        this.endTimeD = endTimeD;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
