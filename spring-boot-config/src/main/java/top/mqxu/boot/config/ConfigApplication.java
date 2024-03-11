package top.mqxu.boot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author mqxu
 * @date 2024/3/11
 * @description ConfigApplication
 **/
@SpringBootApplication
@ImportResource(locations = {"classpath:beans.xml"})
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
