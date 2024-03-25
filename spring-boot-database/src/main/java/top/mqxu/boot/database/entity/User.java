package top.mqxu.boot.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author mqxu
 * @date 2024/3/18
 * @description User
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Integer id;
    private String phone;
    private String password;
    private String avatar;
    private Date createTime;
}