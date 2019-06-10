package com.example.designpattern.demo.template.abstractTemplate;

public abstract class AbstractTemplate {

    /***
     * 模板方法
     */
    public void templateMethod(){

    }

    /***
     * 基本方法的声明（由子类实现）
     */
    protected abstract void abstractMethod();

    /***
     * 基本方法（空方法）
     */
    protected void hookMethod(){

    }

    /***
     * 基本方法（已经实现）
     */
    private final void concreteMethod(){

        //相关业务逻辑
    }
}
