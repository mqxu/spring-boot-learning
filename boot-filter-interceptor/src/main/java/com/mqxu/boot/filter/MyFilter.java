package com.mqxu.boot.filter;

import com.mqxu.boot.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-04-04
 **/
//@WebFilter(filterName = "myFilter", urlPatterns = {"/*"})
@Slf4j
public class MyFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("myFilter 初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("myFilter 请求处理之前----doFilter方法之前过滤请求");
        chain.doFilter(request, response);
        log.info("myFilter 请求处理之后----doFilter方法之后处理响应");
    }

    @Override
    public void destroy() {
        log.info("myFilter 销毁");
    }
}