package top.mqxu.boot.config.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author mqxu
 * @date 2024/3/11
 * @description Dog
 **/
@Data
@Component
public class Dog {
    @Value("${person.dog.name}")
    private String name;

    @Value("${person.dog.age}")
    private Integer age;
}
