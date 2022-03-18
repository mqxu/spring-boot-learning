package com.mqxu.boot.orm.service;

import com.mqxu.boot.orm.entity.Article;
import com.mqxu.boot.orm.service.impl.ArticleJdbcServiceImpl;
import com.mqxu.boot.orm.service.impl.ArticleJpaServiceImpl;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-18
 **/
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ArticleServiceTest {

    @Resource
    private ArticleJdbcServiceImpl articleJdbcService;

    @Resource
    private ArticleJpaServiceImpl articleJpaService;


    @Test
    public void saveArticleByJDBC() {
        Article article = Article.builder()
                .author("mqxu")
                .title("SpringBoot")
                .content("SpringBoot从入门到精通")
                .build();
        Article saveArticle = articleJdbcService.saveArticle(article);
        assertNotNull(saveArticle);
    }

    @Test
    public void saveArticleByJPA() {
        Article article = Article.builder()
                .author("mqxu")
                .title("SpringCloud")
                .content("SpringCloud从入门到精通")
                //.createTime(new Date())
                //.updateTime(new Date())
                .build();
        Article saveArticle = articleJpaService.saveArticle(article);
        assertNotNull(saveArticle);
    }
}