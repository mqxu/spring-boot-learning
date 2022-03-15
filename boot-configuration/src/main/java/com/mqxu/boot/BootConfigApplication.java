package com.mqxu.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @description: 启动主类
 * @author: mqxu
 * @date: 2022-03-14
 **/
@SpringBootApplication
@ImportResource(locations = {"classpath:beans.xml"})
@Slf4j
public class BootConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootConfigApplication.class, args);
        log.info("服务启动成功");
    }
}
