package com.mqxu.boot.basic.enums;

/**
 * @description: 枚举成员
 * @author: mqxu
 * @date: 2022-04-11
 **/
public class SwitchMember {
    public static void main(String[] args) {
        Platform p = Platform.ANDROID;
        System.out.println(p);
        p.platformInfo();
    }
}

enum Platform {
    /**
     * 平台枚举
     */
    ANDROID, IOS, WEB;

    /**
     * 构造方法，默认私有
     */
    private Platform() {
        System.out.println("构造方法被调用 : " + this);
    }

    public void platformInfo() {
        System.out.println("平台信息:" + this);
    }
}
