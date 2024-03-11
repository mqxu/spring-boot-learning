package top.mqxu.boot.config.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author mqxu
 * @date 2024/3/11
 * @description Employee
 **/
@Data
@Component
@PropertySource(value = {"classpath:employee.properties"})
public class Employee {

    /**
     * 使用 SpEL 读取 employee 的 names 属性，并分割为字符串集合
     */
    @Value("#{'${employee.names}'.split(',')}")
    private List<String> employeeNames;

    @Value("#{'${employee.names}'.split(',')[0]}")
    private String firstEmployeeName;


    @Value("#{${employee.ages}}")
    private Map<String, Integer> employeeAges;


    @Value("#{${employee.ages}.one}")
    private Integer firstAge;

    @Value("#{systemProperties['java.home']}")
    private String javaHome;

    @Value("#{systemProperties['user.dir']}")
    private String userDir;

}
