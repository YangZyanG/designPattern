package com.example.designpattern.demo.builder.builder;

import com.example.designpattern.demo.builder.abstractBuilder.Builder;
import com.example.designpattern.demo.builder.entity.Product;

/***
 * 担任这个角色的是与应用程序紧密相关的一些类，它们在应用程序调用下创建产品的实例。
 * 个角色要完成的任务包括：1.实现抽象建造者Builder所声明的接口，给出一步一步地完成创建产品实例的操作。2.在建造过程完成后，提供产品的实例。
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.setPart1("编号：9527");
    }

    @Override
    public void buildPart2() {
        product.setPart2("名称：XXX");
    }

    @Override
    public Product result() {
        return product;
    }
}
