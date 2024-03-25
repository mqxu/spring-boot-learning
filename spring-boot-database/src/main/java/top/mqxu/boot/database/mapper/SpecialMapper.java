package top.mqxu.boot.database.mapper;

import top.mqxu.boot.database.entity.Special;

import java.util.List;

/**
 * @author mqxu
 * @date 2024/3/24
 * @description SpecialMapper
 **/
public interface SpecialMapper {

    List<Special> selectAll();
}
