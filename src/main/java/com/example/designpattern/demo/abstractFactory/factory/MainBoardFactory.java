package com.example.designpattern.demo.abstractFactory.factory;

import com.example.designpattern.demo.abstractFactory.service.MainBoard;
import com.example.designpattern.demo.abstractFactory.service.impl.AmdMainBoard;
import com.example.designpattern.demo.abstractFactory.service.impl.IntelMainBoard;

/***
 * 简单工厂模式
 */
public class MainBoardFactory {

    public static MainBoard createMainBoard(int type){
        MainBoard mainBoard = null;
        if(1 == type){
            mainBoard = new IntelMainBoard(755);
        }else if(2 == type){
            mainBoard = new AmdMainBoard(938);
        }
        return mainBoard;
    }
}
