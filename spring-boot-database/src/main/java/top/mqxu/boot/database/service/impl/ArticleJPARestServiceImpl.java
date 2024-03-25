package top.mqxu.boot.database.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.mqxu.boot.database.dao.ArticleRepository;
import top.mqxu.boot.database.entity.Article;
import top.mqxu.boot.database.service.ArticleRestService;

import java.util.List;
import java.util.Optional;

/**
 * @author mqxu
 * @date 2024/3/18
 * @description ArticleJPARestServiceImpl
 **/
@Service
public class ArticleJPARestServiceImpl implements ArticleRestService {
    //将JPA仓库对象注入
    @Resource
    private ArticleRepository articleRepository;

    @Override
    public Article saveArticle(Article article) {
        //保存一个对象到数据库
        articleRepository.save(article);
        return  article;
    }

    @Override
    public void deleteArticle(Long id) {
        //根据id删除1条数据库记录
        articleRepository.deleteById(id);
    }

    @Override
    public void updateArticle(Article article) {
        //更新一个对象到数据库，仍然使用 save 方法，实际是根据 article.id 去 update
        articleRepository.save(article);
    }

    @Override
    public Article getArticle(Long id) {
        //根据 id 查找一条数据
        Optional<Article> articleOptional = articleRepository.findById(id);
        return articleOptional.orElse(null);
    }

    @Override
    public List<Article> getAll() {
        return articleRepository.findAll();
    }
}
