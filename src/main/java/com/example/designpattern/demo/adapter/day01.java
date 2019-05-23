package com.example.designpattern.demo.adapter;

/***
 * 适配器模式
 * 适配器模式把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 */
public class day01 {

    /***
     * 适配器模式的用途
     * 用电器做例子，笔记本电脑的插头一般都是三相的，即除了阳极、阴极外，还有一个地极。
     * 而有些地方的电源插座却只有两极，没有地极。电源插座与笔记本电脑的电源插头不匹配使得笔记本电脑无法使用。
     * 这时候一个三相到两相的转换器（适配器）就能解决此问题，而这正像是本模式所做的事情。
     */

    /***
     * 场景
     * 类适配器
     * Adaptee类并没有sampleOperation2()方法，而客户端则期待这个方法。为使客户端能够使用Adaptee类，提供一个中间环节，即类Adapter，把Adaptee的API与Target类的API衔接起来。
     */

    /***
     * 对象适配器
     * 与类的适配器模式一样，对象的适配器模式把被适配的类的API转换成为目标类的API。
     * 与类的适配器模式不同的是，对象的适配器模式不是使用继承关系连接到Adaptee类，而是使用委派关系连接到Adaptee类。
     */
}
