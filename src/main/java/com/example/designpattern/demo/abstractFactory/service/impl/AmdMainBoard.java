package com.example.designpattern.demo.abstractFactory.service.impl;

import com.example.designpattern.demo.abstractFactory.service.MainBoard;

public class AmdMainBoard implements MainBoard {

    private int cpuHoles;

    public AmdMainBoard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
    }
}
