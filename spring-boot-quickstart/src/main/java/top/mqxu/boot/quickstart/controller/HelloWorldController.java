package top.mqxu.boot.quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mqxu
 * @date 2024/2/26
 * @description HelloWorldController
 **/
@RestController
public class HelloWorldController {

    @GetMapping("hello")
    public String getHello() {
        return "hello world!";
    }
}
