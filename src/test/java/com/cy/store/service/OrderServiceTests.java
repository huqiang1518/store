package com.cy.store.service;

import com.cy.store.entity.Address;
import com.cy.store.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTests {
    @Autowired
    private IOrderService orderService;

    @Test
    public void create(){
        Integer[] cids = {1,2,3,4,};
        //create(Integer aid, Integer uid, String username, Integer[] cids)
        Order order = orderService.create(16, 23, "西西", cids);
        System.out.println(order);
    }
}
