package com.mqxu.boot.model;

import com.mqxu.boot.util.MixPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-14
 **/
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "user")
@PropertySource(value = {"classpath:user.yml"}, factory = MixPropertySourceFactory.class)
public class User {

    private String name;

    private Integer age;

    @Valid
    private Book book;
}
