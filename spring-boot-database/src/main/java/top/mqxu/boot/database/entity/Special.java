package top.mqxu.boot.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mqxu
 * @date 2024/3/24
 * @description Special
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Special {
    private String id;
    private String title;
    private String banner;
    private Long viewCount;
    private Long followersCount;
    private String isFollowing;
    private String updated;
}
