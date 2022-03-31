package com.mqxu.boot.orm.mybatis.domain;

import java.io.Serial;
import java.io.Serializable;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author mqxu
 * @TableName t_course
 */
@Data
@Alias("Course")
public class Course implements Serializable {
    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 课程名称
     */
    private String courseName;

    @Serial
    private static final long serialVersionUID = 1L;
}