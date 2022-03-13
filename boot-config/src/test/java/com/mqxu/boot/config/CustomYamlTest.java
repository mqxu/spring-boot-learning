package com.mqxu.boot.config;

import com.mqxu.boot.config.model.Family;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-14
 **/
// @RunWith(SpringRunner.class)  Junit4
@ExtendWith(SpringExtension.class)  //Junit5
@SpringBootTest
public class CustomYamlTest {
    @Autowired
    Family family;

    @Test
    public void printFamily() {
        System.out.println(family);
    }
}
