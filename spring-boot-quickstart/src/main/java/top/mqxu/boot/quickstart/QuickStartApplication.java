package top.mqxu.boot.quickstart;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * @author mqxu
 * @date 2024/3/11
 * @description QuickStartApplication
 **/
@Slf4j
@SpringBootApplication
public class QuickStartApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(QuickStartApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("启动成功");
        log.info("测试地址：http://localhost:{}/hello", env.getProperty("server.port"));
    }
}
