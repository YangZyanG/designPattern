package com.example.designpattern.demo.builder.builder;

import com.example.designpattern.demo.builder.abstractBuilder.MessageBuilder;
import com.example.designpattern.demo.builder.entity.GoodbyeMessage;

public class GoodbyeBuilder extends MessageBuilder {

    public GoodbyeBuilder(){
        msg = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setBody("欢送内容");
    }

    @Override
    public void buildBody() {
        msg.setSubject("欢送标题");
    }
}
