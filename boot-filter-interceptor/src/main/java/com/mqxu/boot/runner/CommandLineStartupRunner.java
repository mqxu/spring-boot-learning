package com.mqxu.boot.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-04-04
 **/
@Component
@Slf4j
public class CommandLineStartupRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("CommandLineStartupRunner传入参数：{}", Arrays.toString(args));
    }
}
