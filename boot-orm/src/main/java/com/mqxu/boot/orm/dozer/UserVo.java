package com.mqxu.boot.orm.dozer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-27
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVo {
    private Integer id;
    private String phone;
    private String avatar;
    private List<Book> books;
}
