package com.mqxu.boot.orm.mybatis.domain;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author mqxu
 * @TableName t_teacher
 */
@Data
@Alias("Teacher")
public class Teacher implements Serializable {
    /**
     * 教师id
     */
    private Integer teacherId;

    /**
     * 教师姓名
     */
    private String teacherName;

    /**
     * 教师管理的班级id
     */
    private Integer clazzId;

    /**
     * 教师管理的班级对象
     */
    private Clazz clazz;

    @Serial
    private static final long serialVersionUID = 1L;
}