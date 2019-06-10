package com.example.designpattern.demo.template.concreteTemplate;

import com.example.designpattern.demo.template.abstractTemplate.AbstractTemplate;

public class ConcreteTemplate extends AbstractTemplate {

    /***
     * abstractMethod()方法所代表的就是强制子类实现的剩余逻辑
     */
    @Override
    protected void abstractMethod() {

    }

    /***
     * hookMethod()方法是可选择实现的逻辑，不是必须实现的
     */
    @Override
    public void hookMethod(){

    }
}
