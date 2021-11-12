package com.cy.store.service;

import com.cy.store.entity.Address;

import java.util.List;

/**
 * 收货地址业务层接口
 */
public interface IAddressService {
    /**
     * 根据地址数据插入
     * @param uid 地址id
     * @param username 修改执行人
     * @param address 地址数据
     */
    void addNewAddress(Integer uid,String username,Address address);


    /**
     * 根据用户id获取地址信息
     * @param uid 用户id
     * @return 地址数据
     */
    List<Address> getByUid(Integer uid);

    /**
     * 修改某个用户的某条收货地址数据为默认收货地址
     * @param aid 收货地址id
     * @param uid 用户id
     * @param username 修改执行人
     */
    void setDefault(Integer aid,Integer uid,String username);

    /**
     * 删除用户选中的收货地址数据
     * @param aid 地址id
     * @param uid 用户id
     * @param username 修改执行人
     */
    void delete(Integer aid,Integer uid,String username);

    Address getByAid(Integer aid,Integer uid);

}
