package top.mqxu.boot.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author mqxu
 * @date 2024/3/18
 * @description UserVo
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVO {
    private Integer id;
    private String phone;
    private String password;
    private String avatar;
    private Date createTime;
    private List<Book> books;
}
