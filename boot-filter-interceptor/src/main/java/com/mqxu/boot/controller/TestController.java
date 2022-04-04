package com.mqxu.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-04-04
 **/
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request, HttpSession session) {
        //操作 request 的 attribute
        //request.setAttribute("a", "a");
        //request.setAttribute("a", "b");
        //request.getAttribute("a");
        //request.removeAttribute("a");

        //操作 session 的 attribute
        //session.setAttribute("a", "a");
        //session.getAttribute("a");
        //session.invalidate();

        return "hello world---";
    }
}
