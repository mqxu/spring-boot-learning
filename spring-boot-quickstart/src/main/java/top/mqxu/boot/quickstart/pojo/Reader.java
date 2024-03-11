package top.mqxu.boot.quickstart.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author mqxu
 * @date 2024/2/26
 * @description Reader
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reader {
    private String name;
    private Integer age;
}
