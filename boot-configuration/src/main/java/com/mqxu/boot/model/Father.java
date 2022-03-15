package com.mqxu.boot.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-14
 **/
@Data
public class Father {

    private String name;

    @Min(value = 22, message = "爸爸年龄不能小于22岁！！")
    private Integer age;

    @Email
    private String email;
}
