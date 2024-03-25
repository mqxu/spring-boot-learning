package top.mqxu.boot.database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.mqxu.boot.database.entity.Article;

/**
 * @author mqxu
 * @date 2024/3/18
 * @description ArticleRepository
 **/
public interface ArticleRepository extends JpaRepository<Article,Long> {
    Article findByAuthor(String author);
}