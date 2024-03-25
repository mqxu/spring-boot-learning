package top.mqxu.boot.database.service;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.mqxu.boot.database.entity.Special;

import java.util.List;


@SpringBootTest
class SpecialServiceTest {
    @Resource
    private SpecialService specialService;

    @Test
    void getAll() {
        List<Special> all = specialService.getAll();
        all.forEach(System.out::println);
    }
}