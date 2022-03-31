package com.mqxu.boot.orm.mybatis.mapper;

import com.mqxu.boot.orm.mybatis.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-28
 **/
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TeacherMapperTest {

    @Resource
    private TeacherMapper teacherMapper;

    @Test
    void findOneByOne() {
        Teacher teacher = teacherMapper.findOneByOne(1);
        System.out.println(teacher);
    }
}