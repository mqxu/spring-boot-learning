package top.mqxu.boot.database.dao;

import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import top.mqxu.boot.database.entity.Article;

import java.util.List;


@Repository  //持久层依赖注入注解
public class ArticleJDBCDAO {

    @Resource
    private JdbcTemplate jdbcTemplate;

    //保存文章
    public void save(Article article) {
        //jdbcTemplate.update 适合于 insert 、update 和 delete 操作
        jdbcTemplate.update("INSERT INTO t_article (author, title,content) values(?, ?, ?) ",
                article.getAuthor(),
                article.getTitle(),
                article.getContent());
    }

    //删除文章
    public void deleteById(Long id) {
        jdbcTemplate.update("DELETE FROM t_article WHERE id = ? ",id);
    }

    //更新文章
    public void updateById(Article article) {
        jdbcTemplate.update("UPDATE t_article SET author = ?, title = ? ,content = ? WHERE id = ? ",
                article.getAuthor(),
                article.getTitle(),
                article.getContent(),
                article.getId());
    }

    //根据id查找文章
    public Article findById(Long id) {
        //queryForObject 用于查询单条记录返回结果
        return jdbcTemplate.queryForObject("SELECT * FROM t_article WHERE id=? ",
                new Object[]{id},new BeanPropertyRowMapper<>(Article.class));
    }

    //查询所有
    public List<Article> findAll(){
        //query 用于查询结果列表
        return jdbcTemplate.query("SELECT * FROM t_article ",  new BeanPropertyRowMapper<>(Article.class));
    }

}