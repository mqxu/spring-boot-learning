package com.mqxu.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-04-04
 **/
@RestController
public class HelloController {
    @GetMapping("hello")
    public String getHello() {
        return "hello world";
    }
}
