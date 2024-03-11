package top.mqxu.boot.config.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author mqxu
 * @date 2024/3/11
 * @description Person
 **/
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;

    private Integer age;

    private Boolean happy;

    private Date birthday;

    private Map<String, Object> maps;

    private List<Object> lists;

    private Dog dog;
}
