package com.mqxu.boot.restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-12
 **/
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @GetMapping("world")
    public String getHelloWorld() {
        return "hello world";
    }
}
