package com.example.designpattern.demo.proxy.service.impl;

import com.example.designpattern.demo.proxy.service.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("保存数据");
    }

    @Override
    public void insert() {
        System.out.println("插入数据");
    }
}
