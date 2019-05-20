package com.example.designpattern.demo.abstractFactory;

import com.example.designpattern.demo.abstractFactory.factory.CpuFactory;
import com.example.designpattern.demo.abstractFactory.factory.MainBoardFactory;
import com.example.designpattern.demo.abstractFactory.service.Cpu;
import com.example.designpattern.demo.abstractFactory.service.MainBoard;

/***
 * 简单工厂模式
 */
public class SimpleFactory {

    private Cpu cpu;
    private MainBoard mainBoard;

    public void makeComputer(int cpuType, int mainBoardType){
        install(cpuType, mainBoardType);
    }

    private void install(int cpuType, int mainBoardType){

        this.cpu = CpuFactory.createCpu(cpuType);
        this.mainBoard = MainBoardFactory.createMainBoard(mainBoardType);

        this.cpu.calculate();
        this.mainBoard.installCpu();
    }
}
