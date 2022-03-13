package com.mqxu.boot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @description: 启动主类
 * @author: mqxu
 * @date: 2022-03-13
 **/
@SpringBootApplication
@ImportResource(locations = {"classpath:beans.xml"})
public class BootConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootConfigApplication.class, args);
    }
}
