package top.mqxu.boot.config.entity;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class EmployeeTest {
    @Resource
    private Employee employee;

    @Test
    void testEmployee() {
        //List<String> employeeNames = employee.getEmployeeNames();
        //employeeNames.forEach(System.out::println);

        //System.out.println(employee.getFirstEmployeeName());

        //System.out.println(employee.getEmployeeAges());

        //System.out.println(employee.getFirstAge());

        //System.out.println(employee.getJavaHome());

        System.out.println(employee.getUserDir());

    }
}