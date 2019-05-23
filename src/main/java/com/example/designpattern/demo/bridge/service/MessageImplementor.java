package com.example.designpattern.demo.bridge.service;

/***
 * 实现发送消息的统一接口
 */
public interface MessageImplementor {

    /***
     * 发送消息
     * @param message
     * @param userId
     */
    public void send(String message, String userId);
}
