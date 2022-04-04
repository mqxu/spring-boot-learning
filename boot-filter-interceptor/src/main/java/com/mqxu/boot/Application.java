package com.mqxu.boot;

import com.mqxu.boot.listener.MyListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @description: 启动类
 * @author: mqxu
 * @date: 2022-04-04
 **/
@SpringBootApplication
//@ServletComponentScan
public class Application {

    public static void main(String[] args) {
        //获取ConfigurableApplicationContext上下文
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        //装载监听
        context.addApplicationListener(new MyListener1());
    }
}
