package com.example.designpattern.demo.builder.builder;

import com.example.designpattern.demo.builder.abstractBuilder.MessageBuilder;
import com.example.designpattern.demo.builder.entity.WelcomeMessage;

public class WelcomeBuilder extends MessageBuilder {

    public WelcomeBuilder(){
        msg = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setBody("欢迎内容");
    }

    @Override
    public void buildBody() {
        msg.setSubject("欢迎标题");
    }
}
