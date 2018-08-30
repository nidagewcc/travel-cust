package com.phoenix.travel.po;

import java.math.BigDecimal;
import java.util.Date;

public class Trip {
    private Integer id;

    private String thumbnail;

    private String tripTitle;

    private String tripCity;

    private String tripDesc;

    private BigDecimal basePrice;

    private Byte tripSts;

    private Date createTime;

    private Date updateTime;

    private Byte delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    public String getTripTitle() {
        return tripTitle;
    }

    public void setTripTitle(String tripTitle) {
        this.tripTitle = tripTitle == null ? null : tripTitle.trim();
    }

    public String getTripCity() {
        return tripCity;
    }

    public void setTripCity(String tripCity) {
        this.tripCity = tripCity == null ? null : tripCity.trim();
    }

    public String getTripDesc() {
        return tripDesc;
    }

    public void setTripDesc(String tripDesc) {
        this.tripDesc = tripDesc == null ? null : tripDesc.trim();
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public Byte getTripSts() {
        return tripSts;
    }

    public void setTripSts(Byte tripSts) {
        this.tripSts = tripSts;
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

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}