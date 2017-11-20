package com.kerwin.ssm.common.web;

/**
 * Created by Administrator on 2017/11/20.
 */
public class BaseQuery {
    protected Integer pageIndex = 1;
    protected Integer pageSize = 10;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}