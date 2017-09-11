package com.hadly.dal.model;

import java.util.Date;

/**
 * Created by hadly on 2017/9/11.
 */
public class InstInfo {
    private String instCd;
    private String instId;
    private String url;
    private Date createTime;
    private Date updateTime;

    public String getInstCd() {
        return instCd;
    }

    public void setInstCd(String instCd) {
        this.instCd = instCd;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
