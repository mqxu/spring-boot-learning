package com.mqxu.boot.restful.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @description: Article资源
 * @author: mqxu
 * @date: 2022-03-10
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@JsonPropertyOrder(value = {"content", "title"})
public class Article {
    // @JsonIgnore
    private Long id;

    // @JsonProperty("writer")
    private String author;

    private String title;

    private String content;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private List<Reader> readerList;

}
