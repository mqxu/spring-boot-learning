package com.mqxu.boot.config.model;

import lombok.Data;

/**
 * @description: 每个friend有两个属性：hobby(爱好)和性别(sex)
 * @author: mqxu
 * @date: 2022-03-14
 **/
@Data
public class Friend {
    private String hobby;
    private String gender;
}