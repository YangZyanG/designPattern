package com.example.designpattern.demo.builder.director;

import com.example.designpattern.demo.builder.abstractBuilder.Builder;

/***
 * 担任这个角色的类调用具体建造者角色以创建产品对象。
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
