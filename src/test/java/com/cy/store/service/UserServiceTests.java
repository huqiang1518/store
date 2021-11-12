package com.cy.store.service;

import com.cy.store.entity.User;
import com.cy.store.service.ex.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {
    @Autowired
    private IUserService userService;

    @Test
    public void reg() {
        try {
            User user = new User();
            user.setUsername("test002");
            user.setPassword("123");
            userService.reg(user);
            System.out.println("OK");
        } catch (ServiceException e) {
            //获取类的对象，在获取累的名称
            System.out.println(e.getClass().getSimpleName());
            //获取异常的具体描述信息
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void login() {
        User user = userService.login("test002", "123");
        System.out.println(user);
    }

    @Test
    public void changePassword() {
        userService.changePassword(22, "管理员", "123", "321");
    }

    @Test
    public void getByUid(){
        System.out.println(userService.getByUid(22));
    }

    @Test
    public void changeInfo(){
        User user = new User();
        user.setPhone("886689797");
        user.setEmail("yuan@qq.com");
        user.setGender(0);
        userService.changeInfo(22,"管理员",user);
    }

    @Test
    public void changeAvatar(){
        userService.changeAvatar(23,"/upload/test.png","小明");
    }

}
