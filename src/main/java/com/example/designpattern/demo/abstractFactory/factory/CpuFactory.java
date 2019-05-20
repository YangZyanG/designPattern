package com.example.designpattern.demo.abstractFactory.factory;

import com.example.designpattern.demo.abstractFactory.service.Cpu;
import com.example.designpattern.demo.abstractFactory.service.impl.AmdCpu;
import com.example.designpattern.demo.abstractFactory.service.impl.IntelCpu;

/***
 * 简单工厂模式
 */
public class CpuFactory {

    public static Cpu createCpu(int type){
        Cpu cpu = null;
        if(1 == type){
            cpu = new IntelCpu(755);
        }else if(2 == type){
            cpu = new AmdCpu(938);
        }
        return cpu;
    }
}
