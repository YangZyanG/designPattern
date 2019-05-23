package com.example.designpattern.demo.bridge.abstraction;

import com.example.designpattern.demo.bridge.abstract_.Abstraction;
import com.example.designpattern.demo.bridge.service.Implementor;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor){
        super(implementor);
    }

    public void otherOperation(){

    }
}
