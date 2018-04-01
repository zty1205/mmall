package com.mmall.dao;

import com.mmall.pojo.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customer_id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customer_id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}