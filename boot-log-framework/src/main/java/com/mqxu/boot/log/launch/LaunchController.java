package com.mqxu.boot.log.launch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-04-11
 **/
@RestController
public class LaunchController {
    private static final Logger logger = LoggerFactory.getLogger(LaunchController.class);

    @GetMapping("/launch")
    public void test() {
        logger.info("LaunchController 类启动");
        logger.info("LaunchController 类结束运行");
    }
}
