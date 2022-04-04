package com.mqxu.boot.listener;

import com.mqxu.boot.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

/**
 * @description: 自定义事件监听器方式3：在application.properties中配置监听
 * @author: mqxu
 * @date: 2022-04-04
 **/
@Slf4j
public class MyListener3 implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s 监听到事件源：%s.", MyListener3.class.getName(), event.getSource()));
    }
}