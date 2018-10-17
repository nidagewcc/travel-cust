package com.phoenix.travel.po;

import java.util.Date;

public class Scenic {
    private Integer scenicId;

    private String bannerImgs;

    private String scenicName;

    private String scenicAddress;

    private Integer cityId;

    private String openTime;

    private String ticketInfo;

    private String thumbnail;

    private Byte scenicSts;

    private Date createTime;

    private Date updateTime;

    private Byte delFlag;

    private String scenicDesc;

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public String getBannerImgs() {
        return bannerImgs;
    }

    public void setBannerImgs(String bannerImgs) {
        this.bannerImgs = bannerImgs == null ? null : bannerImgs.trim();
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName == null ? null : scenicName.trim();
    }

    public String getScenicAddress() {
        return scenicAddress;
    }

    public void setScenicAddress(String scenicAddress) {
        this.scenicAddress = scenicAddress == null ? null : scenicAddress.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime == null ? null : openTime.trim();
    }

    public String getTicketInfo() {
        return ticketInfo;
    }

    public void setTicketInfo(String ticketInfo) {
        this.ticketInfo = ticketInfo == null ? null : ticketInfo.trim();
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail == null ? null : thumbnail.trim();
    }

    public Byte getScenicSts() {
        return scenicSts;
    }

    public void setScenicSts(Byte scenicSts) {
        this.scenicSts = scenicSts;
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

    public String getScenicDesc() {
        return scenicDesc;
    }

    public void setScenicDesc(String scenicDesc) {
        this.scenicDesc = scenicDesc == null ? null : scenicDesc.trim();
    }
}