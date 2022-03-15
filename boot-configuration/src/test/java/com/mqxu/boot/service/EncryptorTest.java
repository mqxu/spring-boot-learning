package com.mqxu.boot.service;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-14
 **/
@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class EncryptorTest {

    @Autowired
    private StringEncryptor encryptor;

    @Test
    public void getEncryptor() {
        String result = encryptor.encrypt("happy family");
        log.info(result);
    }
}
