package top.mqxu.boot.database.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.mqxu.boot.database.entity.Special;
import top.mqxu.boot.database.mapper.SpecialMapper;
import top.mqxu.boot.database.service.SpecialService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author mqxu
 * @date 2024/3/24
 * @description SpecialServiceImpl
 **/
@Service
public class SpecialServiceImpl implements SpecialService {
    @Resource
    private SpecialMapper specialMapper;

    @Override
    public List<Special> getAll() {
        List<Special> specials = specialMapper.selectAll();
        specials.forEach(special -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sdf.format(new Date(Long.parseLong(special.getUpdated() + "000")));
            special.setUpdated(format);
        });
        return specials;
    }
}
