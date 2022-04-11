package com.mqxu.boot.exception.advice;

import com.mqxu.boot.exception.utils.AjaxResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @description: 全局业务状态通知
 * @author: mqxu
 * @date: 2022-04-11
 **/
@Component
@ControllerAdvice
public class GlobalResponseAdvice implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body,
                                  MethodParameter methodParameter,
                                  MediaType mediaType,
                                  Class aClass,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        //如果响应结果是JSON数据类型
        if (mediaType.equalsTypeAndSubtype(
                MediaType.APPLICATION_JSON)) {
            if (body instanceof AjaxResponse ajaxResponse) {
                //999 不是标准的HTTP状态码，特殊处理
                if (ajaxResponse.getCode() != 999) {
                    serverHttpResponse.setStatusCode(HttpStatus.valueOf(
                            ajaxResponse.getCode()
                    ));
                }
                return body;
            } else {
                serverHttpResponse.setStatusCode(HttpStatus.OK);
                return AjaxResponse.success(body);
            }

        }
        return body;
    }
}