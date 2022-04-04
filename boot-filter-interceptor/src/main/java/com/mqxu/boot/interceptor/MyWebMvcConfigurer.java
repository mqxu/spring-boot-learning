package com.mqxu.boot.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @description: 注册拦截器,废弃：public class MyWebMvcConfigurer extends WebMvcConfigurerAdapter
 * @author: mqxu
 * @date: 2022-04-04
 **/
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    private final String[] excludePath = {"/static"};


    //@Resource
    //private CustomHandlerInterceptor customHandlerInterceptor;

    @Resource
    private AccessLogInterceptor accessLogInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器 拦截规则
        //多个拦截器时 以此添加 执行顺序按添加顺序
        //registry.addInterceptor(customHandlerInterceptor).addPathPatterns("/*");
        registry.addInterceptor(accessLogInterceptor).addPathPatterns("/**").excludePathPatterns(excludePath);

    }
}