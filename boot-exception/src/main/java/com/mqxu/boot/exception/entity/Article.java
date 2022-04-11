package com.mqxu.boot.exception.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-04-11
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
    @Min(4)
    private Integer id;
    @NotNull(message = "文章标题不能为空")
    private String title;
}
