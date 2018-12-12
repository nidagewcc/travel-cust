package com.phoenix.travel.common.exception;

/**
 * 自定义业务异常
 *
 * @author Weishuo Zhang
 * @create 2018/10/10
 */
public class TravelBizRuntimeException extends RuntimeException {
    private static final long serialVersionUID = -6763486995463561690L;

    public TravelBizRuntimeException() {
        super();
    }

    public TravelBizRuntimeException(String message) {
        super(message);
    }

    public TravelBizRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TravelBizRuntimeException(Throwable cause) {
        super(cause);
    }

    protected TravelBizRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
