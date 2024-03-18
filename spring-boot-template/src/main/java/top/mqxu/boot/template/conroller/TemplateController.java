package top.mqxu.boot.template.conroller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.mqxu.boot.template.entity.Article;

import java.util.Arrays;
import java.util.List;

/**
 * @author mqxu
 * @date 2024/3/11
 * @description TemplateController
 **/
@Controller
@RequestMapping("/template")
public class TemplateController {

    @GetMapping("/freemarker")
    public String freemarkerIndex(Model model) {
        List<Article> articles = Arrays.asList(
                new Article(1, "张三", "Java")
                , new Article(2, "张三丰", "Spring")
                , new Article(3, "张三风", "SpringBoot")
        );
        model.addAttribute("articles", articles);
        System.out.println(articles);
        //模版名称，实际的目录为：resources/templates/freemarker-demo.ftl
        return "freemarker-demo";
    }

    @GetMapping("/thymeleaf")
    public String thymeleafIndex(Model model) {
        List<Article> articles = Arrays.asList(
                new Article(1, "张三", "Java")
                , new Article(2, "张三丰", "Spring")
                , new Article(3, "张三风", "Spring Boot")
        );
        model.addAttribute("articles", articles);
        return "thymeleaf-demo";
    }

    @GetMapping("/thymeleaf1")
    public String index(@RequestParam String name1,
                        HttpServletRequest request,
                        Model model) {

        List<Article> articles = Arrays.asList(
                new Article(1, "张三", "Java")
                , new Article(2, "张三丰", "Spring")
                , new Article(3, "张三风", "Spring Boot")
        );

        request.setAttribute("name2", "world");
        request.getSession().setAttribute("name3", "aaa");
        request.getServletContext().setAttribute("name4", "bbb");

        model.addAttribute("articles", articles);

        return "thymeleaf-demo1";
    }

}
