package com.example.designpattern.demo.observer.subject.impl;

import com.example.designpattern.demo.observer.subject.Subject;

/***
 * 具体主题角色类
 */
public class ConcreteSubject extends Subject {

    private String state;

    public void change(String newState){
        state = newState;
        System.out.println("主题状态为：" + state);
        this.notifyObservers(state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
