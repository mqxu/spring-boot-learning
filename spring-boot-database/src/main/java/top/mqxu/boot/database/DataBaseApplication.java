package top.mqxu.boot.database;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mqxu
 * @date 2024/3/18
 * @description DataBaseApplication
 **/
@SpringBootApplication
@MapperScan(basePackages = {"top.mqxu.boot.database.mapper"})
public class DataBaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataBaseApplication.class, args);
    }
}
