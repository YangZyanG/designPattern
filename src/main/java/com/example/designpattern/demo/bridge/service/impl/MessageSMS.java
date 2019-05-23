package com.example.designpattern.demo.bridge.service.impl;

import com.example.designpattern.demo.bridge.service.MessageImplementor;

/***
 * 系统内短消息的实现类
 */
public class MessageSMS implements MessageImplementor {

    @Override
    public void send(String message, String userId) {
        System.out.println("使用系统内短消息的方法，发送消息'"+message+"'给"+userId);
    }
}
