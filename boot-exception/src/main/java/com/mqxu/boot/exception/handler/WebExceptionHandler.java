package com.mqxu.boot.exception.handler;

import com.mqxu.boot.exception.enums.CustomExceptionType;
import com.mqxu.boot.exception.exception.CustomException;
import com.mqxu.boot.exception.utils.AjaxResponse;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 全局异常处理器
 * @author: mqxu
 * @date: 2022-04-11
 **/
@ControllerAdvice
public class WebExceptionHandler {

    /**
     * 处理程序员主动转换的自定义异常
     *
     * @param e 异常
     * @return AjaxResponse
     */
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public AjaxResponse customerException(CustomException e) {
        if (e.getCode() == CustomExceptionType.SYSTEM_ERROR.getCode()) {
            //400异常不需要持久化，将异常信息以友好的方式告知用户就可以
            //将500异常信息持久化处理，方便运维人员处理
        }
        return AjaxResponse.error(e);
    }

    /**
     * 处理程序员在程序中未能捕获（遗漏的）异常
     *
     * @param e 异常
     * @return AjaxResponse
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public AjaxResponse exception(Exception e) {
        //TODO 将异常信息持久化处理，方便运维人员处理
        return AjaxResponse.error(new CustomException(CustomExceptionType.OTHER_ERROR));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public AjaxResponse handleBindException(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        assert fieldError != null;
        return AjaxResponse.error(new CustomException(CustomExceptionType.USER_INPUT_ERROR, fieldError.getDefaultMessage()));
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public AjaxResponse handleBindException(BindException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        assert fieldError != null;
        return AjaxResponse.error(new CustomException(CustomExceptionType.USER_INPUT_ERROR, fieldError.getDefaultMessage()));
    }


    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public AjaxResponse handleIllegalArgumentException(IllegalArgumentException e) {
        return AjaxResponse.error(new CustomException(CustomExceptionType.USER_INPUT_ERROR, e.getMessage()));
    }
}