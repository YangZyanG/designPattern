package com.example.designpattern.demo.abstractFactory.factory;

import com.example.designpattern.demo.abstractFactory.service.Cpu;
import com.example.designpattern.demo.abstractFactory.service.MainBoard;
import com.example.designpattern.demo.abstractFactory.service.impl.AmdCpu;
import com.example.designpattern.demo.abstractFactory.service.impl.AmdMainBoard;

/***
 * 抽象工厂模式
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        return new AmdCpu(938);
    }

    @Override
    public MainBoard createMainBoard() {
        return new AmdMainBoard(938);
    }
}
