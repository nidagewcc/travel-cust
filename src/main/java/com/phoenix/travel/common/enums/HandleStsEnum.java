package com.phoenix.travel.common.enums;

/**
 * 处理状态枚举
 *
 * @author Weishuo Zhang
 * @create 2018/10/11
 */
public enum HandleStsEnum {

    /**
     * 全部
     */
    ALL(2),

    /**
     * 待处理
     */
    WAIT(0),

    /**
     * 已处理
     */
    DONE(1);

    HandleStsEnum(int code) {
        this.code = code;
    }

    private final int code;

    public int getCode() {
        return code;
    }
}
