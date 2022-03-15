package com.mqxu.boot.service;

import lombok.Data;
import lombok.Setter;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-14
 **/
public class TestBeanService {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
