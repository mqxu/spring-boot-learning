package com.mqxu.boot.model;

import com.mqxu.boot.util.MixPropertySourceFactory;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @description: 务必注意 成员变量名 要和yaml配置项的key一一对应
 * @author: mqxu
 * @date: 2022-03-14
 **/
@Data
@Component
@Validated
// 配置整体前缀
@ConfigurationProperties(prefix = "family")
@PropertySource(value = {"classpath:family.yml"}, factory = MixPropertySourceFactory.class)
public class Family {

    @Length(min = 5, max = 20, message = "家庭名称长度必须在5-20位之间")
    private String familyName;

    private Father father;

    private Mother mother;

    private Child child;
}
