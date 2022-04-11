package com.mqxu.boot.log;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-04-11
 **/
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class SpringbootLogTest {
    private final Logger logger = LoggerFactory.getLogger(SpringbootLogTest.class);

    @Test
    public void contextLoads() {
        logger.info("数据库日志info");
        logger.error("数据库日志error");
    }
}
