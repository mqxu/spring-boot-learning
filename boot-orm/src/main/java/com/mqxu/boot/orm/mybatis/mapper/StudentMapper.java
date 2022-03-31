package com.mqxu.boot.orm.mybatis.mapper;

import com.mqxu.boot.orm.mybatis.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mqxu
 * @description 针对表【t_student】的数据库操作Mapper
 * @createDate 2022-03-28 11:44:23
 * @Entity com.mqxu.boot.orm.mybatis.domain.Student
 */
public interface StudentMapper {

    /**
     * 根据学生id查询学生
     *
     * @param studentId 学生id
     * @return 学生信息（关联查询出其所在班级信息）
     */
    Student findManyByOne(int studentId);


    /**
     * 根据学生id查询学生
     *
     * @param studentId 学生id
     * @return 学生信息（关联查询出其所在班级信息，其所选择的课程信息）
     */
    Student getStudent(int studentId);


    /**
     * 新增学生
     *
     * @param student student对象
     * @return int
     */
    int insert(Student student);

    /**
     * 批量新增学生
     *
     * @param students 学生集合
     * @return int
     */
    int batchInsert(@Param("students") List<Student> students);


    /**
     * 批量删除
     *
     * @param ids id集合
     * @return int
     */
    int batchDelete(@Param("ids") List<Integer> ids);


    /**
     * 批量修改学生信息
     *
     * @param students 学生集合
     * @return int？
     */
    int batchUpdate(@Param("students") List<Student> students);


    /**
     * 动态查询
     *
     * @param student 查询对象
     * @return Student
     */
    List<Student> findStudentBy(@Param("student") Student student);

}




