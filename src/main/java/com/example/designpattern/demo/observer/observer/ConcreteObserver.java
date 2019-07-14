package com.example.designpattern.demo.observer.observer;

public class ConcreteObserver implements Observer {

    private String observerState;

    @Override
    public void update(String state) {
        observerState = state;
        System.out.println("状态为："+observerState);
    }
}
