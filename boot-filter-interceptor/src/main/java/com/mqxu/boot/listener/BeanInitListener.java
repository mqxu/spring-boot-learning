package com.mqxu.boot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @description: 类初始化监听
 * @author: mqxu
 * @date: 2022-04-04
 **/
@Component
@Slf4j
public class BeanInitListener implements InitializingBean {
    static {
        log.info("类初始化静态代码块");
    }

    public BeanInitListener() {
        log.info("类初始化构造方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("类初始化 afterPropertiesSet方法");
    }

    @PostConstruct
    void method() {
        log.info("类初始化 postConstruct注解方法!");
    }
}
