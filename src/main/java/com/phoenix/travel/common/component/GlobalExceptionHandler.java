package com.phoenix.travel.common.component;

import com.phoenix.travel.common.enums.RspCodeEnum;
import com.phoenix.travel.common.exception.TravelBizRuntimeException;
import com.phoenix.travel.common.model.TravelResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 *
 * @author Weishuo Zhang
 * @create 2018/10/10
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(TravelBizRuntimeException.class)
    @ResponseBody
    public TravelResult handleBizException(TravelBizRuntimeException e) {
        logger.error("业务异常：{}，{}", e.getMessage(), RspCodeEnum.getEnum(e.getMessage()).getMsg());
        return TravelResult.err(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public TravelResult handleException(Exception e) {
        logger.error("系统异常：", e);
        return TravelResult.err(RspCodeEnum.UNKNOWN_ERR.getCode());
    }
}
