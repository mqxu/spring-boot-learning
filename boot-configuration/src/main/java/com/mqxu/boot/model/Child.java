package com.mqxu.boot.model;

import lombok.Data;

import java.util.List;

/**
 * @description: 每个child有name、age属性，还有一个friends集合
 * @author: mqxu
 * @date: 2022-03-14
 **/
@Data
public class Child {

    private String name;
    private Integer age;
    private List<Friend> friends;
}
