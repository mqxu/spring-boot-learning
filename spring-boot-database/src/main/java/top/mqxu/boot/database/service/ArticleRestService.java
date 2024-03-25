package top.mqxu.boot.database.service;

import top.mqxu.boot.database.entity.Article;

import java.util.List;

/**
 * @author mqxu
 * @date 2024/3/18
 * @description ArticleRestService
 **/
public interface ArticleRestService {
    Article saveArticle(Article article);

    void deleteArticle(Long id);

    void updateArticle(Article article);

    Article getArticle(Long id);

    List<Article> getAll();
}
