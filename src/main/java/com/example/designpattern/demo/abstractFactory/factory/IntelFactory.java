package com.example.designpattern.demo.abstractFactory.factory;

import com.example.designpattern.demo.abstractFactory.service.Cpu;
import com.example.designpattern.demo.abstractFactory.service.MainBoard;
import com.example.designpattern.demo.abstractFactory.service.impl.IntelCpu;
import com.example.designpattern.demo.abstractFactory.service.impl.IntelMainBoard;

/***
 * 抽象工厂模式
 */
public class IntelFactory implements AbstractFactory{

    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public MainBoard createMainBoard() {
        return new IntelMainBoard(755);
    }
}
