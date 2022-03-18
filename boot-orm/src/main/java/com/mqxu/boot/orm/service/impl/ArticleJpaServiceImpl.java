package com.mqxu.boot.orm.service.impl;

import com.mqxu.boot.orm.dao.ArticleDao;
import com.mqxu.boot.orm.dao.ArticleRepository;
import com.mqxu.boot.orm.entity.Article;
import com.mqxu.boot.orm.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-18
 **/
@Service
public class ArticleJpaServiceImpl implements ArticleService {

    @Resource
    private ArticleRepository articleRepository;


    @Override
    @Transactional(rollbackFor = {Exception.class})
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void deleteById(int id) {
        articleRepository.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void updateArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public List<Article> selectAll() {
        return articleRepository.findAll();
    }

    @Override
    public Article findById(int id) {
        Optional<Article> optional = articleRepository.findById(id);
        return optional.orElse(null);
        //return optional.get();
    }

    @Override
    public List<Article> findByAuthor(String author) {
        return articleRepository.findByAuthor(author);
    }
}
