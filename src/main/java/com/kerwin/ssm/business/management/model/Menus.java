package com.kerwin.ssm.business.management.model;

public class Menus {
    private String id;

    private String mName;

    private String url;

    private String parentId;

    private Integer mLevel;

    private Integer mIndex;

    private Byte mHidden;

    private Byte mStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Integer getmLevel() {
        return mLevel;
    }

    public void setmLevel(Integer mLevel) {
        this.mLevel = mLevel;
    }

    public Integer getmIndex() {
        return mIndex;
    }

    public void setmIndex(Integer mIndex) {
        this.mIndex = mIndex;
    }

    public Byte getmHidden() {
        return mHidden;
    }

    public void setmHidden(Byte mHidden) {
        this.mHidden = mHidden;
    }

    public Byte getmStatus() {
        return mStatus;
    }

    public void setmStatus(Byte mStatus) {
        this.mStatus = mStatus;
    }
}