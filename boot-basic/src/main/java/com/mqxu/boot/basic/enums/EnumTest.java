package com.mqxu.boot.basic.enums;

/**
 * @description: values(), ordinal() 和 valueOf() 方法
 * enum 定义的枚举类默认继承了 java.lang.Enum 类，并实现了 java.lang.Serializable 和 java.lang.Comparable 两个接口。
 * values(), ordinal() 和 valueOf() 方法位于 java.lang.Enum 类中：
 * values() 返回枚举类中所有的值。
 * ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
 * valueOf()方法返回指定字符串值的枚举常量。
 * @author: mqxu
 * @date: 2022-04-11
 **/
public class EnumTest {
    public static void main(String[] args) {
        // 调用 values()
        Color[] arr = Color.values();
        // 迭代枚举
        for (Color col : arr) {
            // 查看索引
            System.out.println(col + " at index " + col.ordinal());
        }
        // 使用 valueOf() 返回枚举常量，不存在的会报错 IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
    }
}
