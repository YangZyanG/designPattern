package com.example.designpattern.demo.singleton;

/***
 * 按照《高效Java 第二版》中的说法：单元素的枚举类型已经成为实现Singleton的最佳方法。
 * 用枚举来实现单例非常简单，只需要编写一个包含单个元素的枚举类型即可。
 */
public enum EnumSingleton {

    /***
     * 定义一个枚举的元素，它就代表了Singleton的一个实例。
     */
    uniqueInstance;

    public void singleton(){
        //单例操作
    }
}
