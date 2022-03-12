package com.mqxu.boot.restful.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @description:
 * @author: mqxu
 * @date: 2022-03-10
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Reader implements Serializable {
    private String name;
    private Integer age;
}
