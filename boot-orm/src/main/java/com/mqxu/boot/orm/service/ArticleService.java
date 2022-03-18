package com.mqxu.boot.orm.service;

import com.mqxu.boot.orm.entity.Article;

import java.util.List;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-18
 **/
public interface ArticleService {
    /**
     * 新增文章
     *
     * @param article 入参
     * @return article
     */
    Article saveArticle(Article article);


    /**
     * 根据id删除文章
     *
     * @param id id
     */
    void deleteById(int id);


    /**
     * 修改文章
     *
     * @param article 入参
     */
    void updateArticle(Article article);


    /**
     * 查询所有文章
     *
     * @return List<Article>
     */
    List<Article> selectAll();


    /**
     * 根据id查询文章
     *
     * @param id id
     * @return article
     */
    Article findById(int id);


    /**
     * 根据作者查询文章
     *
     * @param author author
     * @return List<Article>
     */
    List<Article> findByAuthor(String author);

}
