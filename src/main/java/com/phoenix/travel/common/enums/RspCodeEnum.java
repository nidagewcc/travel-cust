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
    UNKNOWN_ERR("-1", "未知错误"),

    ADMIN_NOT_EXIST("10001", "管理员不存在"),
    INCORRECT_PWD("10002", "密码错误"),

    ORDER_NOT_EXIST("10003", "订单不存在"),

    SCENIC_NOT_EXIST("10004", "景点不存在"),
    SCENIC_UPDATE_FAIL("10005", "景点更新失败"),

    IMG_NOT_EMPTY("10006", "图片不能为空"),
    IMG_FORMAT_INVALID("10007", "图片格式不支持");


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


    public static RspCodeEnum getEnum(String code) {
        RspCodeEnum[] values = RspCodeEnum.values();
        for (RspCodeEnum val : values) {
            if (val.code.equals(code)) {
                return val;
            }
        }
        return null;
    }
}
