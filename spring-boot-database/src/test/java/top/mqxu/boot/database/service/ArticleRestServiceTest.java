package top.mqxu.boot.database.service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.mqxu.boot.database.entity.Article;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ArticleRestServiceTest {
    @Resource
    private  ArticleService articleService;

    @Test
    void saveArticle() {
        Article article = Article
                .builder()
                .author("mqxu")
                .title("Spring Boot 学习")
                .content("Spring Boot 学习")
                .build();
        articleService.saveArticle(article);
    }

    @Test
    void deleteArticle() {
        articleService.deleteArticle(1L);
    }

    @Test
    void updateArticle() {
        Article article = Article
                .builder()
                .id(1L)
                .author("Java工程师")
                .title("Spring Boot 学习最新版")
                .content("Spring Boot 学习最新版")
                .build();
        articleService.updateArticle(article);
    }

    @Test
    void getArticle() {
        Article article = articleService.getArticle(1L);
        log.info(String.valueOf(article));
    }

    @Test
    void getAll() {
        List<Article> all = articleService.getAll();
        all.forEach(article -> log.info(String.valueOf(article)));
    }
}