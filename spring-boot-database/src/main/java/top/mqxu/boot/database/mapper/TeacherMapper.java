package top.mqxu.boot.database.mapper;

import top.mqxu.boot.database.entity.Teacher;

/**
 * @author mqxu
 * @date 2024/3/25
 * @description TeacherMapper
 **/
public interface TeacherMapper {
    /**
     * 根据id查询教师信息（一对一，关联查询出其管理的班级对象信息）
     *
     * @param teacherId 教师id
     * @return 教师对象
     */
    Teacher selectOneByOne(int teacherId);
}
