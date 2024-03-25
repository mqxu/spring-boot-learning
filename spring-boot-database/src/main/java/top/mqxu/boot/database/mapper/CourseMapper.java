package top.mqxu.boot.database.mapper;

import top.mqxu.boot.database.entity.Course;

import java.util.List;

/**
 * @author mqxu
 * @date 2024/3/25
 * @description CourseMapper
 **/
public interface CourseMapper {

    /**
     * 查询所有课程（关联查询出每门课程的选课学生）
     * @return List<Course>
     */
    List<Course> selectAll();
}
