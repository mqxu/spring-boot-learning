package com.mqxu.boot.exception.controller;

import com.mqxu.boot.exception.entity.Article;
import com.mqxu.boot.exception.service.ExceptionService;
import com.mqxu.boot.exception.utils.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @description: 测试接口
 * @author: mqxu
 * @date: 2022-04-11
 **/
@RestController
public class ArticleController {
    @Resource
    private ExceptionService exceptionService;


    @GetMapping("/articles/{id}")
    public Article getArticle(@PathVariable("id") int id) {
        if (id == 0) {
            exceptionService.systemBizError();
        }
        exceptionService.userBizError(id);
        return Article.builder()
                .id(id)
                .title("SpringBoot")
                .build();
    }

    @PostMapping("/articles")
    public Article saveArticle(@Valid @RequestBody Article article) {
        return article;
    }

}
