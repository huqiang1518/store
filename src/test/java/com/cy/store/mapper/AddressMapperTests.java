package com.cy.store.mapper;

import com.cy.store.entity.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressMapperTests {
    @Autowired
    private AddressMapper addressMapper;

    @Test
    public void insert(){
        Address address = new Address();
        address.setUid(23);
        address.setPhone("6566464646");
        address.setName("西西");
        addressMapper.insert(address);
    }

    @Test
    public void countByUid(){
        Integer count = addressMapper.countByUid(23);
        System.out.println(count);
    }

    @Test
    public void findByUid(){
        List<Address> list = addressMapper.findByUid(23);
        System.out.println(list);
    }

    @Test
    public void findByAid(){
        System.out.println(addressMapper.findByAid(6));
    }

    @Test
    public void updateNonDefaultByUid(){
        addressMapper.updateNonDefaultByUid(23);
    }

    @Test
    public void updateDefaultByAid(){
        addressMapper.updateDefaultByAid(6,"红红",new Date());
    }

    @Test
    public void deleteByAid(){
        addressMapper.deleteByAid(1);
    }


    @Test
    public void findLastModified(){
        System.out.println(addressMapper.findLastModified(23));
    }

    /*@Test
    public void modifiedAddress(){
        Address address = new Address();
        address.setAddress("天津路");
        addressMapper.modifiedAddress(15,address);
    }*/

}
