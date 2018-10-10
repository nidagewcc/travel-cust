package com.phoenix.travel.common.enums;

/**
 * 状态
 *
 * @author Weishuo Zhang
 * @create 2018/10/10
 */
public enum StatusEnum {
    NORMAL(0),
    DELETE(1);

    StatusEnum(int code) {
        this.code = code;
    }

    private final int code;

    public int getCode() {
        return code;
    }
}
