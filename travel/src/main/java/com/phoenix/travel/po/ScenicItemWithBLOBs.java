package com.phoenix.travel.po;

public class ScenicItemWithBLOBs extends ScenicItem {
    private String scenicDesc;

    private String scenicNotice;

    public String getScenicDesc() {
        return scenicDesc;
    }

    public void setScenicDesc(String scenicDesc) {
        this.scenicDesc = scenicDesc == null ? null : scenicDesc.trim();
    }

    public String getScenicNotice() {
        return scenicNotice;
    }

    public void setScenicNotice(String scenicNotice) {
        this.scenicNotice = scenicNotice == null ? null : scenicNotice.trim();
    }
}