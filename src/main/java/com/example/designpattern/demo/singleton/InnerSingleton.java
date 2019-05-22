package com.example.designpattern.demo.singleton;

/***
 * 类级内部类单例方式
 */
public class InnerSingleton {

    private InnerSingleton(){

    }

    private static InnerSingleton getInstance(){
        return Singleton.singleton;
    }

    private static class Singleton{
        private static InnerSingleton singleton = new InnerSingleton();
    }
}
