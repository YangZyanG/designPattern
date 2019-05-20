package com.example.designpattern.demo.abstractFactory;

import com.example.designpattern.demo.abstractFactory.service.Cpu;
import com.example.designpattern.demo.abstractFactory.service.MainBoard;

/***
 * 抽象工厂模式
 */
public class AbstractFactory {

    private Cpu cpu;
    private MainBoard mainBoard;

    public void makeComputer(com.example.designpattern.demo.abstractFactory.factory.AbstractFactory af){
        install(af);
    }

    public void install(com.example.designpattern.demo.abstractFactory.factory.AbstractFactory af){

        this.cpu = af.createCpu();
        this.mainBoard = af.createMainBoard();

        cpu.calculate();
        mainBoard.installCpu();
    }
}
