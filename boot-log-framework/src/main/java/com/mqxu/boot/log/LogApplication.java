package com.mqxu.boot.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-04-11
 **/
@SpringBootApplication
public class LogApplication {
    public static void main(String[] args) {
        //下面语句使得Log4j2日志输出使用异步处理，减小输出日志对性能的影响
        //System.setProperty("Log4jContextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
        SpringApplication.run(LogApplication.class, args);
    }
}
