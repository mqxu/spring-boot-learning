package com.mqxu.boot.basic.enums;

/**
 * @description: 枚举迭代
 * @author: mqxu
 * @date: 2022-04-11
 **/
public class EnumIterator {
    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color);
        }
    }
}
