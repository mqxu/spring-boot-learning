package com.mqxu.boot;

import com.mqxu.boot.domain.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @description: 启动主类
 * @author: mqxu
 * @date: 2022-03-07
 **/
@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    @Bean
    public Student student() {
        return new Student();
    }
}
