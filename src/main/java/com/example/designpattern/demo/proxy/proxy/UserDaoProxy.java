package com.example.designpattern.demo.proxy.proxy;

import com.example.designpattern.demo.proxy.service.UserDao;

public class UserDaoProxy implements UserDao {

    private UserDao dao;

    public UserDaoProxy(UserDao dao){
        this.dao = dao;
    }

    @Override
    public void save() {
        System.out.println("开始执行方法");
        dao.save();
        System.out.println("方法执行结束");
    }

    @Override
    public void insert() {

    }
}
