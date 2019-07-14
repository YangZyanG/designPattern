package com.example.designpattern.demo.observer;

import com.example.designpattern.demo.observer.observer.ConcreteObserver;
import com.example.designpattern.demo.observer.observer.Observer;
import com.example.designpattern.demo.observer.subject.Subject;
import com.example.designpattern.demo.observer.subject.impl.ConcreteSubject;
import org.junit.Test;

/***
 * 观察者模式是对象的行为模式，又叫发布-订阅(Publish/Subscribe)模式、模型-视图(Model/View)模式、源-监听器(Source/Listener)模式或从属者(Dependents)模式。
 * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态上发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
 */
public class day01 {

    @Test
    public void method1(){
        Subject subject = new ConcreteSubject();

        Observer observer;
        for (int i=0; i<10; ++i){
            observer = new ConcreteObserver();
            subject.attach(observer);
        }

        ((ConcreteSubject) subject).change("required");
    }
}
