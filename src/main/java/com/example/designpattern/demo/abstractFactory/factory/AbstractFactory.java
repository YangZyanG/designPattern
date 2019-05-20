package com.example.designpattern.demo.abstractFactory.factory;

import com.example.designpattern.demo.abstractFactory.service.Cpu;
import com.example.designpattern.demo.abstractFactory.service.MainBoard;

/***
 * 抽象工厂模式
 */
public interface AbstractFactory {

    public Cpu createCpu();

    public MainBoard createMainBoard();
}
