package top.mqxu.boot.database.service.impl;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.mqxu.boot.database.dao.ArticleJDBCDAO;
import top.mqxu.boot.database.entity.Article;
import top.mqxu.boot.database.service.ArticleService;

import java.util.List;

/**
 * @author mqxu
 * @date 2024/3/18
 * @description ArticleServiceImpl
 **/
@Slf4j
@Service   //服务层依赖注入注解
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleJDBCDAO articleJDBCDAO;

    //@Transactional
    @Override
    public void saveArticle(Article article) {
        articleJDBCDAO.save(article);
        //int a = 2/0;  //人为制造一个异常，用于测试事务
    }

    @Override
    public void deleteArticle(Long id) {
        articleJDBCDAO.deleteById(id);
    }

    @Override
    public void updateArticle(Article article) {
        articleJDBCDAO.updateById(article);
    }

    @Override
    public Article getArticle(Long id) {
        return articleJDBCDAO.findById(id);
    }

    @Override
    public List<Article> getAll() {
        return articleJDBCDAO.findAll();
    }
}
