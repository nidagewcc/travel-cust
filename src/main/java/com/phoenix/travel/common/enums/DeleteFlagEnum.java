package com.phoenix.travel.common.enums;

/**
 * 删除标志枚举
 *
 * @author Weishuo Zhang
 * @create 2018/10/11
 */
public enum DeleteFlagEnum {

    NORMAL(0), DELETE(1);

    DeleteFlagEnum(int code) {
        this.code = code;
    }

    private final int code;

    public int getCode() {
        return code;
    }
}
