package com.example.designpattern.demo.adapter.adapter;

import com.example.designpattern.demo.adapter.adaptee.ObjectAdaptee;

public class ObjectAdapter {

    private ObjectAdaptee objectAdaptee;

    public ObjectAdapter(ObjectAdaptee objectAdaptee){
        this.objectAdaptee = objectAdaptee;
    }

    public void sampleOperation1(){
        this.objectAdaptee.sampleOperation1();
    }

    public void sampleOperation2(){

    }
}
