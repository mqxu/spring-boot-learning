package com.mqxu.boot.restful.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@Slf4j
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@WebMvcTest(ArticleController.class)
//@ExtendWith(SpringExtension.class)
public class ArticleControllerTest {

    //注入mock对象
    @Resource
    private MockMvc mockMvc;


    //在所有测试方法执行之前进行mock对象初始化
//    @BeforeAll
//    static void setUp() {
//        mockMvc = MockMvcBuilders.standaloneSetup(new ArticleController()).build();
//    }

    //测试方法
    @Test
    public void saveArticle() throws Exception {
        String article = """
                {
                    "id": 1,
                    "author": "mqxu",
                    "title": "SpringBoot",
                    "content": "SpringBoot",
                    "createTime": "2022-03-12 12:12:12",
                    "readerList":[{"name":"aaa","age":18},{"name":"bbb","age":20}]
                }""";

        MvcResult result = mockMvc.perform(
                        MockMvcRequestBuilders
                                .request(HttpMethod.POST, "/api/v1/articles/body")
                                .contentType("application/json")
                                .content(article)
                )
                .andExpect(MockMvcResultMatchers.status().isOk())  //HTTP:status 200
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.author").value("mqxu"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.readerList[0].age").value(18))
                .andDo(print())
                .andReturn();
        result.getResponse().setCharacterEncoding("UTF-8");
        log.info(result.getResponse().getContentAsString());
    }

}