package com.example.designpattern.demo.builder.abstractBuilder;

import com.example.designpattern.demo.builder.entity.AutoMessage;

import java.util.Date;

public abstract class MessageBuilder {

    protected AutoMessage msg;

    public abstract void buildSubject();
    public abstract void buildBody();

    public void buildTo(String to){
        msg.setTo(to);
    }

    public void buildFrom(String from){
        msg.setFrom(from);
    }

    public void buildSendDate(){
        msg.setSendDate(new Date());
    }

    public void sendMessage(){
        msg.send();
    }
}
