package com.example.designpattern.demo.bridge.abstraction;

import com.example.designpattern.demo.bridge.abstract_.AbstractMessage;
import com.example.designpattern.demo.bridge.service.MessageImplementor;

/***
 * 普通消息类
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor implementor){
        super(implementor);
    }

    /***
     * 普通消息直接调用父类方法即可
     * @param message
     * @param userId
     */
    @Override
    public void sendMessage(String message, String userId){
        super.sendMessage(message, userId);
    }
}
