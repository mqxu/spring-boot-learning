package top.mqxu.boot.database.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.mqxu.boot.database.entity.Article;
import top.mqxu.boot.database.service.ArticleService;

import java.util.List;

/**
 * @author mqxu
 * @date 2024/3/18
 * @description ArticleController
 **/
@Slf4j
@RestController
@RequestMapping("/api/v1/articles")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @PostMapping
    public void save(@RequestBody Article article) {
        articleService.saveArticle(article);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {
        articleService.deleteArticle(id);
    }

    @PutMapping
    public void update(@RequestBody Article article) {
        articleService.updateArticle(article);
    }

    @GetMapping()
    public Article getArticle(@RequestParam("id") Long id) {
        return articleService.getArticle(id);
    }

    @GetMapping("all")
    public List<Article> getArticles() {
        return articleService.getAll();
    }
}
