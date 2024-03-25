package top.mqxu.boot.database.dao;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.mqxu.boot.database.entity.Article;


@SpringBootTest
@Slf4j
class ArticleRepositoryTest {
    @Resource
    private ArticleRepository articleRepository;

    @Test
    void findByAuthor() {
        Article article = articleRepository.findByAuthor("mqxu");
        log.info(String.valueOf(article));
    }
}