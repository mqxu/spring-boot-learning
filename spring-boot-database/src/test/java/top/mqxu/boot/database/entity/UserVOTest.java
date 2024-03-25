package top.mqxu.boot.database.entity;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
@Slf4j
class UserVOTest {
    @Test
    void beanCopyTest() {
        User user = User.builder()
                .id(1)
                .phone("13951905171")
                .password("123")
                .avatar("1.jpg")
                .createTime(new Date())
                .build();

        UserVO userVo = new UserVO();
        userVo.setId(user.getId());
        userVo.setPhone(user.getPhone());
        userVo.setPassword(user.getPassword());
        userVo.setAvatar(user.getAvatar());
        userVo.setCreateTime(user.getCreateTime());

        Book book1 = Book.builder().id(1).name("后端学习").build();
        Book book2 = Book.builder().id(1).name("前端学习").build();

        List<Book> bookList = List.of(book1, book2);
        userVo.setBooks(bookList);

        log.info(String.valueOf(userVo));
    }


    @Test
    void beanUtilsTest() {
        User user = User.builder().id(1).phone("13951905171").password("123").avatar("1.jpg").createTime(new Date()).build();
        UserVO userVo = new UserVO();
        //是 Spring 的 BeanUtils
        BeanUtils.copyProperties(user, userVo);
        log.info(String.valueOf(userVo));
    }

}