package com.mqxu.boot.config;

import com.mqxu.boot.config.service.TestBeanService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-14
 **/
@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TestBeanServiceTest {
    //注入Spring上下文环境
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    public void testLoadService() {
        //测试Spring上下文环境中是否有testBeanService这样一个bean，有的话表示xml配置文件生效
        boolean flag = ioc.containsBean("testBeanService");
        assertTrue(flag);
        TestBeanService testBeanService = (TestBeanService) ioc.getBean("testBeanService");
        log.info(String.valueOf(testBeanService));
        assertEquals("SpringBoot", testBeanService.getName());
    }
}
