package top.mqxu.boot.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author mqxu
 * @date 2024/3/18
 * @description Article
 **/
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class Article {
//    private Integer id;
//    private String author;
//    private String title;
//    private String content;
//}


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="t_article")
public class Article {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 32)
    private String author;

    @Column(nullable = false, unique = true,length = 32)
    private String title;

    @Column(length = 512)
    private String content;

}