package top.mqxu.boot.config.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import top.mqxu.boot.config.factory.MixPropertySourceFactory;

/**
 * @author mqxu
 * @date 2024/3/11
 * @description Family
 **/
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "family")  //整体前缀
//@PropertySource(value = {"classpath:family.properties"})  //加载外部配置文件
@PropertySource(value = {"classpath:family.yml"}, factory = MixPropertySourceFactory.class)
public class Family {

    //@Value("${family.family-name}")
    private String familyName;

    //@Value("${family.father}")
    @Length(min = 6, max = 20, message = "父亲姓名必须是6-20位之间")
    private String father;

    //@Value("${family.mother}")
    private String mother;

    //@Value("${family.child}")
    private String child;

    @Range(min = 5, message = "家庭年限最少5年以上")
    private Integer years;

}
