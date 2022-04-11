package com.mqxu.boot.interceptor;

import com.mqxu.boot.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: 自定义拦截器类，了解拦截器的生命周期
 * @author: mqxu
 * @date: 2022-04-04
 **/
@Slf4j
@Component
public class CustomHandlerInterceptor implements HandlerInterceptor {

    @Resource
    private TestService testService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("preHandle:请求前调用");
        log.info(testService.test());
        //返回 false 则请求中断
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("postHandle:请求后调用");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("afterCompletion:请求调用完成后回调方法，即在视图渲染完成后回调");

    }

}