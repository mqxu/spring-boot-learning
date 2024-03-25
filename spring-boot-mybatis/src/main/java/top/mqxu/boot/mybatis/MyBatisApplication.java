package top.mqxu.boot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mqxu
 * @date 2024/3/25
 * @description MyBatisApplication
 **/
@SpringBootApplication
@MapperScan(basePackages = {"top.mqxu.boot.mybatis.mapper"})
public class MyBatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication.class, args);
    }
}
