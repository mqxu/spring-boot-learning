package top.mqxu.boot.database.service;


import top.mqxu.boot.database.entity.Special;

import java.util.List;

/**
 * @author mqxu
 * @date 2024/3/24
 * @description SpecialService
 **/
public interface SpecialService {
    List<Special> getAll();
}
