package com.mqxu.boot.controller;

import com.mqxu.boot.domain.Student;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: HelloController
 * @author: mqxu
 * @date: 2022-03-08
 **/
@RestController
public class HelloController {

    private final Student student;

    public HelloController(Student student) {
        this.student = student;
    }


    @GetMapping(value = "hello")
    public String getHello() {
        return "hello world";
    }

    @GetMapping(value = "student")
    public Student getStudent() {
        student.setId(123);
        student.setName("张三");
        System.out.println(student);
        return student;
    }

    @GetMapping("/stu")
    public Student getStu() {
        System.out.println(student);
        return student;
    }

}
