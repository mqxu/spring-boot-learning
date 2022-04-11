package com.mqxu.boot.log.controller;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class LogController {
    //private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public void test() {
        log.debug("debug日志");
        log.info("info日志");
        log.warn("warn日志");
        log.error("error日志");
    }
}
