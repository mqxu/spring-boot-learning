package com.mqxu.boot.datasource.service;

import com.mqxu.boot.datasource.entity.BootUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.List;


/**
 * @description: BootUserServiceTest
 * @author: mqxu
 * @date: 2022-03-31
 **/
@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
class BootUserServiceTest {
    @Resource
    private BootUserService bootUserService;

    @Test
    void getUsers() {
        List<BootUser> users = bootUserService.getUsers();
        users.forEach(user -> log.info(String.valueOf(user)));
    }

    @Test
    void saveUser() {
        BootUser bootUser = BootUser.builder().name("测试用户").detail("用户详情").build();
        bootUserService.saveUser(bootUser);
    }
}