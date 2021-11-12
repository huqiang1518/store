package com.cy.store.mapper;


import com.cy.store.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setUsername("wenxin");
        user.setPassword("123");
        Integer rows = userMapper.insert(user);
        System.out.println(rows);
    }

    @Test
    public void findByUsername() {
        String username = "huqiang";
        User result = userMapper.findByUsername(username);
        System.out.println(result);
    }

    @Test
    public void updatePasswordByUid() {
        userMapper.updatePasswordByUid(6, "321", "管理员", new Date());
    }

    @Test
    public void findByUid() {
        System.out.println(userMapper.findByUid(6));
    }

    @Test
    public void updateInfoByUid() {
        User user = new User();
        user.setUid(22);
        user.setPhone("156086778");
        user.setEmail("test002@qq.com");
        user.setGender(1);
        userMapper.updateInfoByUid(user);

    }

    @Test
    public void updateAvatarByUid() {
        userMapper.updateAvatarByUid(23,
                                    "/upload/avatar.png",
                                    "管理员", new Date());
    }


}
