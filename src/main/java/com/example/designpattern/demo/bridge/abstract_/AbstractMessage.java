package com.example.designpattern.demo.bridge.abstract_;

import com.example.designpattern.demo.bridge.service.MessageImplementor;

/***
 * 抽象消息类
 */
public abstract class AbstractMessage {

    private MessageImplementor implementor;

    public AbstractMessage(MessageImplementor implementor){
        this.implementor = implementor;
    }

    /***
     * 发送消息，委派给实现部分的方法
     * @param message
     * @param userId
     */
    public void sendMessage(String message, String userId){
        implementor.send(message, userId);
    }
}
