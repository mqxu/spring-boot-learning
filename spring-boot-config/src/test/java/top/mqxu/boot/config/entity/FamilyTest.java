package top.mqxu.boot.config.entity;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class FamilyTest {
    @Resource
    private Family family;

    @Test
    public void testFamily() {
        System.out.println(family);
    }
}