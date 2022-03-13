package com.mqxu.boot.config.model;

import lombok.Data;

import java.util.List;

/**
 * @description: 孩子除了名字(name)和年龄（age）两个属性，还有一个friends的集合
 * @author: mqxu
 * @date: 2022-03-14
 **/
@Data
public class Child {
    private String name;
    private Integer age;
    private List<Friend> friends;
}