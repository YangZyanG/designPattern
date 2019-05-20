package com.example.designpattern.demo.abstractFactory.service.impl;

import com.example.designpattern.demo.abstractFactory.service.Cpu;

public class IntelCpu implements Cpu {

    /***
     * cpu的针脚数
     */
    private int pins;

    public IntelCpu(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU的针脚数：" + pins);
    }
}
