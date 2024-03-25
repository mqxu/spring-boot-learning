package top.mqxu.boot.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import top.mqxu.boot.mybatis.entity.Student;

import java.util.List;

/**
 * @author mqxu
 * @date 2024/3/25
 * @description StudentMapper
 **/
public interface StudentMapper {
    int insert(Student student);

    Student findStudentById(int studentId);

    int updateById(Student student);

    int deleteById(int studentId);

    int batchInsert(@Param("students") List<Student> students);

    int batchDelete(@Param("idList") List<Integer> ids);

    int batchUpdate(@Param("students") List<Student> students);

    List<Student> selectByDynamicSql(Student student);
}
