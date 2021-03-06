package com.mqxu.boot.orm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-18
 **/
@SpringBootApplication
@MapperScan(basePackages = {"com.mqxu.boot.orm.mybatis.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
