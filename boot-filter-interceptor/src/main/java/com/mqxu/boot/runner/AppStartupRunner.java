package com.mqxu.boot.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @description: AppStartupRunner
 * @author: mqxu
 * @date: 2022-04-04
 **/
@Slf4j
@Component
public class AppStartupRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        log.info("ApplicationRunner参数名称: {}", args.getOptionNames());
        log.info("ApplicationRunner参数值: {}", args.getOptionValues("age"));
        log.info("ApplicationRunner参数: {}", Arrays.toString(args.getSourceArgs()));
    }
}