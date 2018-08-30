package com.phoenix.travel.po;

import java.util.Date;

public class ScenicItem {
    private Integer id;

    private String bannerImgs;

    private String scenicTitle;

    private String scenicAddr;

    private String scenicLocation;

    private String openTime;

    private String ticketInfo;

    private Byte scenicSts;

    private Date createTime;

    private Date updateTime;

    private Byte delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannerImgs() {
        return bannerImgs;
    }

    public void setBannerImgs(String bannerImgs) {
        this.bannerImgs = bannerImgs == null ? null : bannerImgs.trim();
    }

    public String getScenicTitle() {
        return scenicTitle;
    }

    public void setScenicTitle(String scenicTitle) {
        this.scenicTitle = scenicTitle == null ? null : scenicTitle.trim();
    }

    public String getScenicAddr() {
        return scenicAddr;
    }

    public void setScenicAddr(String scenicAddr) {
        this.scenicAddr = scenicAddr == null ? null : scenicAddr.trim();
    }

    public String getScenicLocation() {
        return scenicLocation;
    }

    public void setScenicLocation(String scenicLocation) {
        this.scenicLocation = scenicLocation == null ? null : scenicLocation.trim();
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
}