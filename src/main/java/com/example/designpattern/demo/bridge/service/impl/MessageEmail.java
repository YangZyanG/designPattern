package com.example.designpattern.demo.bridge.service.impl;

import com.example.designpattern.demo.bridge.service.MessageImplementor;

/***
 * 邮件短消息的实现类
 */
public class MessageEmail implements MessageImplementor {

    @Override
    public void send(String message, String userId) {
        System.out.println("使用邮件短消息的方法，发送消息'"+message+"'给"+userId);
    }
}
