package com.mqxu.boot.orm.mybatis.domain;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author mqxu
 * @TableName t_student
 */
@Data
@Alias("Student")
public class Student implements Serializable {
    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 学生所属班级的id
     */
    private Integer clazzId;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 学生籍贯
     */
    private String hometown;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 多方里声明一方的对象
     */
    private Clazz clazz;

    /**
     * 一个学生可以选多门课（多对多，就是双向的一对多）
     */
    private List<Course> courses;

    @Serial
    private static final long serialVersionUID = 1L;
}