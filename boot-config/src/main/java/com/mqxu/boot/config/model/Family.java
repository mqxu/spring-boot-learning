package com.mqxu.boot.config.model;

import com.mqxu.boot.config.util.MixPropertySourceFactory;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @description: Family实体类
 * @author: mqxu
 * @date: 2022-03-14
 **/
//@Data
//@Component
//public class Family {
//    @Value("${family.family-name}")
//    private String familyName;
//}
@Data
@Component
//表示配置的整体前缀
//@ConfigurationProperties(prefix = "family")
@Validated
@PropertySource(value = {"classpath:family.properties"})
//@PropertySource(value = {"classpath:family.yml"}, factory = MixPropertySourceFactory.class)
public class Family {

    /**
     * 成员变量名称要和yml配置项key一一对应
     */
    @Length(min = 5, max = 20, message = "家庭名长度必须位于5到20之间")
    private String familyName;
    private Father father;
    private Mother mother;
    private Child child;
}