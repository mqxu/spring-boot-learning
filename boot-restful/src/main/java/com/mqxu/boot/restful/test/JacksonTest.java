package com.mqxu.boot.restful.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mqxu.boot.restful.model.Reader;


/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-10
 **/
public class JacksonTest {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Reader reader = Reader.builder().name("aaa").age(12).build();
        // 序列化
        String readerStr = mapper.writeValueAsString(reader);
        System.out.println(readerStr);

        // 反序列化
        String str = """
                {
                  "name": "zhangsan",
                  "age": 22
                }""";
        Reader reader1 = mapper.readValue(str, Reader.class);
        System.out.println(reader1);
    }
}
