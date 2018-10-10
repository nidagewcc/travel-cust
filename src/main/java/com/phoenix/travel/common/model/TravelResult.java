package com.phoenix.travel.common.model;

import com.phoenix.travel.common.enums.RspCodeEnum;

import java.io.Serializable;

/**
 * 通用响应结构
 *
 * @author Weishuo Zhang
 * @create 2018/10/8
 */
public class TravelResult implements Serializable {
    private static final long serialVersionUID = -4985676615074344459L;

    private TravelResult(Object data) {
        this.code = RspCodeEnum.SUCCESS.getCode();
        this.msg = RspCodeEnum.SUCCESS.getMsg();
        this.data = data;
    }

    private TravelResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = true;
    }

    private TravelResult(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static TravelResult ok() {
        return new TravelResult(true);
    }

    public static TravelResult ok(Object data) {
        return new TravelResult(data);
    }

    public static TravelResult err(String code) {
        RspCodeEnum rspCodeEnum = RspCodeEnum.getEnum(code);
        return new TravelResult(rspCodeEnum.getCode(), rspCodeEnum.getMsg(), false);
    }

    private String code;
    private String msg;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
