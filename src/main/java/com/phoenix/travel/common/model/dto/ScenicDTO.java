package com.phoenix.travel.common.model.dto;

/**
 * 新增景点传输对象
 *
 * @author Weishuo Zhang
 * @create 2018/10/12
 */
public class ScenicDTO {

    private String scenicName;
    private Integer cityId;
    private String scenicAddress;
    private String openTime;
    private String ticketInfo;
    private String bannerImgs;

    private String scenicDesc;

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getScenicAddress() {
        return scenicAddress;
    }

    public void setScenicAddress(String scenicAddress) {
        this.scenicAddress = scenicAddress;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getTicketInfo() {
        return ticketInfo;
    }

    public void setTicketInfo(String ticketInfo) {
        this.ticketInfo = ticketInfo;
    }

    public String getBannerImgs() {
        return bannerImgs;
    }

    public void setBannerImgs(String bannerImgs) {
        this.bannerImgs = bannerImgs;
    }

    public String getScenicDesc() {
        return scenicDesc;
    }

    public void setScenicDesc(String scenicDesc) {
        this.scenicDesc = scenicDesc;
    }

    @Override
    public String toString() {
        return "ScenicDTO{" +
                "scenicName='" + scenicName + '\'' +
                ", cityId=" + cityId +
                ", scenicAddress='" + scenicAddress + '\'' +
                ", openTime='" + openTime + '\'' +
                ", ticketInfo='" + ticketInfo + '\'' +
                ", bannerImgs='" + bannerImgs + '\'' +
                ", scenicDesc='" + scenicDesc + '\'' +
                '}';
    }
}
