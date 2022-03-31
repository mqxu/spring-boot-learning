package com.mqxu.boot.orm.mybatis.mapper;

import com.mqxu.boot.orm.mybatis.domain.Teacher;

/**
 * @author mqxu
 * @description 针对表【t_teacher】的数据库操作Mapper
 * @createDate 2022-03-28 11:44:23
 * @Entity com.mqxu.boot.orm.mybatis.domain.Teacher
 */
public interface TeacherMapper {

    /**
     * 根据教师id查询教师信息
     *
     * @param teacherId 教师id
     * @return 教师信息
     */
    Teacher findOneByOne(int teacherId);
}




