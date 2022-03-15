package com.mqxu.boot.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


/**
 * @description: JUnit5
 * @author: mqxu
 * @date: 2022-03-14
 **/
@SpringBootTest
@ExtendWith(SpringExtension.class)
class BeanTest {

    @Autowired
    private Family family;

    @Autowired
    private User user;

    @Test
    void printFamily() {
        System.out.println(family);
    }

    @Test
    void printUser() {
        System.out.println(user);
    }
}