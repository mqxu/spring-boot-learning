package top.mqxu.boot.database.mapper;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.mqxu.boot.database.entity.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    void insert() {
        Student student = Student.builder()
                .clazzId(1)
                .studentName("test学生")
                .hometown("江苏南京")
                .birthday(LocalDate.of(2000, 10, 10))
                .build();
        int n = studentMapper.insert(student);
        assertEquals(n, 1);
    }

    @Test
    void deleteByPrimaryKey() {
        int i = studentMapper.deleteByPrimaryKey(3011);
        assertEquals(1, i);
    }

    @Test
    void selectByPrimaryKey() {
        Student student = studentMapper.selectByPrimaryKey(1001);
        assertEquals("钱智康", student.getStudentName());
    }

    @Test
    void updateByPrimaryKeySelective() {
        Student student = Student.builder()
                .studentId(3000)
                .clazzId(2)
                .studentName("新名字")
                .build();
        int n = studentMapper.updateByPrimaryKeySelective(student);
        assertEquals(1, n);
    }

    @Test
    void batchInsert() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = Student.builder()
                    .studentId(3000 + i)
                    .clazzId(1)
                    .studentName("测试学生" + i)
                    .hometown("测试城市")
                    .birthday(LocalDate.of(1999, 10, 10))
                    .build();
            students.add(student);
        }
        int n = studentMapper.batchInsert(students);
        assertEquals(10, n);
    }

    @Test
    void batchDelete() {
        List<Integer> idList = new ArrayList<>();
        idList.add(3001);
        idList.add(3002);
        idList.add(3003);
        int n = studentMapper.batchDelete(idList);
        assertEquals(3, n);
    }

    @Test
    void batchUpdate() {
        List<Student> students = new ArrayList<>();
        for (int i = 4; i < 10; i++) {
            Student student = Student.builder()
                    .studentId(3000 + i)
                    .clazzId(1)
                    .studentName("新名字" + i)
                    .build();
            students.add(student);
        }
        int n = studentMapper.batchUpdate(students);
        assertEquals(1, n);
    }

    @Test
    void selectByDynamicSql() {
        Student student = Student.builder().hometown("州").build();
        List<Student> students = studentMapper.selectByDynamicSql(student);
        students.forEach(System.out::println);
    }

    @Test
    void getStudentManyToOne() {
        Student student = studentMapper.getStudentManyToOne(1001);
        log.info(String.valueOf(student));
    }

    @Test
    void getStudent() {
        Student student = studentMapper.getStudent(1001);
        log.info(String.valueOf(student));
    }
}