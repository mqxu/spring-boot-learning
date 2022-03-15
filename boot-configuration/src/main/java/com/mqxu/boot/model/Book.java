package com.mqxu.boot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-14
 **/
@Data
public class Book {
    @Length(min = 5, max = 10, message = "书名长度必须在5-10位之间！")
    private String name;

    @Max(value = 100, message = "图书单价不能超过100元！")
    private Double price;

    @Past
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date publishedDate;
}
