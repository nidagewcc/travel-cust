package com.phoenix.travel.common.enums;


/**
 * 通用响应码枚举类
 *
 * @author Weishuo Zhang
 * @create 2018/10/8
 */
public enum RspCodeEnum {

    SUCCESS("10000", "成功"),
    FAIL("99999", "失败"),
    UNKNOWN_ERR("-1", "未知错误");

    RspCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private final String code;
    private final String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
