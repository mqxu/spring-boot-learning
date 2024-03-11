package top.mqxu.boot.quickstart.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import top.mqxu.boot.quickstart.pojo.Article;
import top.mqxu.boot.quickstart.pojo.Reader;
import top.mqxu.boot.quickstart.response.AjaxResponse;

import java.util.Date;
import java.util.List;

/**
 * @author mqxu
 * @date 2024/2/26
 * @description ArticleController
 **/
@RestController
@Slf4j
@RequestMapping("/api/v1/articles")
public class ArticleController {

    /**
     * 使用 GET 方法,根据路径参数 id 查询一篇文章: GET /api/v1/articles/123
     *
     * @param id id
     * @return AjaxResponse
     */
    @GetMapping("{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id) {
        List<Reader> readerList = List.of(Reader.builder().name("zhangsan").age(21).build(), Reader.builder().name("lisi").age(22).build());
        Article article = Article.builder().id(id).author("mqxu").content("SpringBoot 从青铜到王者").title("SpringBoot").readerList(readerList).createTime(new Date()).build();
        log.info("article:" + article);
        return AjaxResponse.success(article);
    }

    /**
     * 使用 GET 方法,根据 url 传参方式，获取到 id 查询一篇文章: GET /api/v1/articles?id=123
     *
     * @param id id
     * @return AjaxResponse
     */
    @GetMapping()
    public AjaxResponse getArticleByParam(@RequestParam("id") long id) {
        List<Reader> readerList = List.of(Reader.builder().name("zhangsan").age(21).build(), Reader.builder().name("lisi").age(22).build());
        Article article = Article.builder().id(id).author("mqxu").content("SpringBoot 从青铜到王者").title("SpringBoot").readerList(readerList).createTime(new Date()).build();
        log.info("article:" + article);
        return AjaxResponse.success(article);
    }

    /**
     * 使用 GET方法，查询所有文章: GET /api/v1/articles/all
     *
     * @return AjaxResponse
     */
    @GetMapping("all")
    public AjaxResponse selectAll() {
        List<Reader> readerList = List.of(Reader.builder().name("zhangsan").age(21).build(), Reader.builder().name("lisi").age(22).build());
        Article article = Article.builder().id(111L).author("mqxu").content("SpringBoot").title("SpringBoot").readerList(readerList).createTime(new Date()).build();
        Article article2 = Article.builder().id(222L).author("mqxu").content("Java").title("Java").readerList(readerList).createTime(new Date()).build();
        return AjaxResponse.success(List.of(article, article2));
    }

    /**
     * 使用 POST 方法(RequestBody方式接收参数),增加一篇 Article : POST /api/v1/articles/body 参数在请求体中用JSON对象
     *
     * @param article article
     * @return AjaxResponse
     */
    @PostMapping("body")
    public AjaxResponse saveArticleByJsonBody(@RequestBody Article article) {
        log.info("saveArticle:" + article);
        return AjaxResponse.success(article);
    }

    /**
     * 使用 POST 方法(RequestParam方式接收参数）增加一篇 Article ：POST /api/v1/articles/param 参数用键值对
     *
     * @param author     author
     * @param title      title
     * @param content    content
     * @param createTime createTime
     * @return AjaxResponse
     */
    @PostMapping("param")
    public AjaxResponse saveArticleByParams(@RequestParam long id, @RequestParam(value = "author", defaultValue = "mqxu", required = false) String author, @RequestParam String title, @RequestParam String content, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") @RequestParam Date createTime) {
        Article article = Article.builder().id(id).title(title).author(author).content(content).createTime(createTime).build();
        return AjaxResponse.success(article);
    }

    /**
     * 使用 POST 方法(RequestParam方式接收参数）增加一篇 Article ：POST /api/v1/articles/form 参数只有一个formData
     *
     * @param formData 表单参数
     * @return AjaxResponse
     */
    @PostMapping("form")
    public AjaxResponse saveArticleByFormData(@RequestParam("formData") String formData) {
        log.info("formData: " + formData);
        // 用 Jackson 反序列化将字符串转为 Java 对象
        ObjectMapper mapper = new ObjectMapper();
        Article article = null;
        try {
            article = mapper.readValue(formData, Article.class);
            log.info("article: " + article);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return AjaxResponse.success(article);
    }

    /**
     * 使用 PUT 方法，以 id 为主键进行更新一篇 Article：PUT /api/v1/articles，参数在请求体用 JSON 对象
     *
     * @param article article
     * @return AjaxResponse
     */
    @PutMapping()
    public AjaxResponse updateArticle(@RequestBody Article article) {
        if (article.getId() == null) {
            log.error("没有id");
            //article.id 是必传参数，因为通常根据 id 去修改数据
        }
        log.info("updateArticle:" + article);
        return AjaxResponse.success(article);
    }

    /**
     * 使用 DELETE 方法，根据路径参数 id 删除一篇 Article：DELETE /api/v1/articles/123
     *
     * @param id id
     * @return AjaxResponse
     */
    @DeleteMapping("{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id) {
        log.info("deleteArticle:" + id);
        return AjaxResponse.success();
    }

}
