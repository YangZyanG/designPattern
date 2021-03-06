package com.example.designpattern.demo.builder.director;

import com.example.designpattern.demo.builder.abstractBuilder.MessageBuilder;

public class MessageDirector {

    MessageBuilder builder;

    public MessageDirector(MessageBuilder builder){
        this.builder = builder;
    }

    public void construct(String toAddress , String fromAddress){
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildSubject();
        this.builder.buildBody();
        this.builder.buildSendDate();
        this.builder.sendMessage();
    }
}
