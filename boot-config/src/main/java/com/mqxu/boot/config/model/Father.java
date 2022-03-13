package com.mqxu.boot.config.model;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

/**
 * @description: 爸爸有名字(name)和年龄（age）两个属性
 * @author: mqxu
 * @date: 2022-03-14
 **/
@Data
public class Father {
    private String name;
    @Range(min = 22, message = "必须年满22岁！")
    private Integer age;
}
