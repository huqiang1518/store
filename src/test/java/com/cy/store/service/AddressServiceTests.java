package com.cy.store.service;

import com.cy.store.entity.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressServiceTests {
    @Autowired
    private IAddressService addressService;

    @Test
    public void addNewAddress(){
        Address address = new Address();
        address.setPhone("998798698698");
        address.setName("男朋友");
        addressService.addNewAddress(23,"管理员",address);
    }

    @Test
    public void setDefault(){
        addressService.setDefault(6,23,"管理员");
    }

    @Test
    public void delete(){
        addressService.delete(2,23,"管理员");
    }

    /*@Test
    public void modifiedAddress(){
        Address address= new Address();
        address.setName("嘻嘻");
        address.setAddress("天津路");
        address.setPhone("45454566644");
        addressService.modifiedAddress(15,23,"管理员",address);
    }*/
}
