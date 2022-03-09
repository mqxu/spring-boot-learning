package com.mqxu.boot.conf;

import com.mqxu.boot.domain.Student;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-09
 **/
@Component
public class StudentConf {
    @Bean
    public Student student() {
        return new Student();
    }
}
