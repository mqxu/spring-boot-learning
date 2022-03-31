package com.mqxu.boot.orm.mybatis.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mqxu.boot.orm.entity.Article;
import com.mqxu.boot.orm.mybatis.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.stubbing.Stubber;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-28
 **/
@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    void findManyByOne() {
        Student student = studentMapper.findManyByOne(1001);
        log.info("学生信息:" + student.getStudentId() + student.getStudentName() + student.getHometown() + student.getBirthday());
        log.info("学生所在信息:" + student.getClazz().getClazzId() + student.getClazz().getClazzName());
    }

    @Test
    void getStudent() {
        Student student = studentMapper.getStudent(1001);
        log.info(String.valueOf(student));
    }

    @Test
    void insertStudent() {
        //Student student = new Student();
        //student.setClazzId(1);
        //student.setStudentName("测试学生");
        //student.setHometown("江苏南京");
        //student.setBirthday(new Date());
        //int insert = studentMapper.insert(student);
        //log.info(String.valueOf(insert));

        long begin = System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++) {
            Student student = new Student();
            student.setClazzId(1);
            student.setStudentName("测试学生" + i);
            student.setHometown("江苏南京");
            student.setBirthday(new Date());
            studentMapper.insert(student);
        }
        long end = System.currentTimeMillis();
        long period = end - begin;
        System.out.println(period);
    }

    @Test
    void batchInsert() {
        long begin = System.currentTimeMillis();
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Student student = new Student();
            student.setClazzId(1);
            student.setStudentName("测试学生" + i);
            student.setHometown("江苏南京");
            student.setBirthday(new Date());
            students.add(student);
        }
        int count = studentMapper.batchInsert(students);
        log.info(String.valueOf(count));
        long end = System.currentTimeMillis();
        long period = end - begin;
        System.out.println(period);
    }

    @Test
    void batchDelete() {
        List<Integer> ids = Arrays.asList(1009, 1010, 1011);
        int rows = studentMapper.batchDelete(ids);
        log.info(rows + "行数据被删除");
    }

    @Test
    void batchUpdate() {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Student student = new Student();
            student.setStudentId(1011 + i);
            student.setStudentName("新名字" + i);
            students.add(student);
        }
        int n = studentMapper.batchUpdate(students);
        log.info(String.valueOf(n));
    }

    @Test
    void findBy() {
        Student student = new Student();
        //student.setStudentId(1002);  //可以实现按学号查
        //student.setStudentName("钱智康"); //可以实现按姓名查
        student.setHometown("州"); //可以实现按籍贯模糊查询
        List<Student> students = studentMapper.findStudentBy(student);
        log.info(String.valueOf(students.size()));
        students.forEach(stu -> log.info(String.valueOf(stu)));
    }

    @Test
    void testPage() {
        // 只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（Select）方法会被分页!!!!
        PageHelper.startPage(1, 2);
        // 动态查询参数为空，默认为查所有数据
        List<Student> students = studentMapper.findStudentBy(new Student());
        PageInfo<Student> page = PageInfo.of(students);
        log.info(String.valueOf(page));
    }
}