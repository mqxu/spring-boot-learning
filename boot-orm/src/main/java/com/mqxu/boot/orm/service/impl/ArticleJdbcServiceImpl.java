package com.mqxu.boot.orm.service.impl;

import com.mqxu.boot.orm.dao.ArticleDao;
import com.mqxu.boot.orm.entity.Article;
import com.mqxu.boot.orm.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-18
 **/
@Service
public class ArticleJdbcServiceImpl implements ArticleService {
    @Resource
    private ArticleDao articleDao;


    @Override
    @Transactional(rollbackFor = {Exception.class})
    public Article saveArticle(Article article) {
        int n = articleDao.save(article);
        if (n != 0) {
            //int a = 3 / 0;
            return article;
        } else {
            return null;
        }
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void updateArticle(Article article) {
    }

    @Override
    public List<Article> selectAll() {
        return articleDao.findAll();
    }

    @Override
    public Article findById(int id) {
        return null;
    }

    @Override
    public List<Article> findByAuthor(String author) {
        return null;
    }
}
