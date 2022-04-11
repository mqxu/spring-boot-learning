package com.mqxu.boot.event;

import org.springframework.context.ApplicationEvent;

/**
 * @description: 自定义事件:继承ApplicationEvent抽象类，并定义自己的构造器
 * @author: mqxu
 * @date: 2022-04-04
 **/
public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }
}
