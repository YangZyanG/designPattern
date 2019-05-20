package com.example.designpattern.demo.factoryMethod;

import com.example.designpattern.demo.factoryMethod.abstractFactory.ExportFactory;
import com.example.designpattern.demo.factoryMethod.factory.ExportHtmlFactory;
import com.example.designpattern.demo.factoryMethod.service.ExportFile;
import org.junit.Test;

/***
 * 工厂方法
 * 工厂方法模式是类的创建模式，又叫做虚拟构造子(Virtual Constructor)模式或者多态性工厂（Polymorphic Factory）模式。
 * 工厂方法模式的用意是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类中。
 */
public class day01 {

    /***
     * 场景介绍
     * 相信很多人都做过导入导出功能，就拿导出功能来说。有这么一个需求：
     * XX系统需要支持对数据库中的员工薪资进行导出，并且支持多种格式如：HTML、CSV、PDF等，每种格式导出的结构有所不同。
     * 比如：财务跟其他人对导出薪资的HTML格式要求可能会不一样，因为财务可能需要特定的格式方便核算或其他用途。
     *
     * 如果使用简单工厂模式，则工厂类必定过于臃肿。因为简单工厂模式只有一个工厂类，它需要处理所有的创建的逻辑。
     * 假如以上需求暂时只支持3种导出的格式以及2种导出的结构，那工厂类则需要6个if else来创建6种不同的类型。如果日后需求不断增加，则后果不堪设想。
     *
     * 这时候就需要工厂方法模式来处理以上需求。在工厂方法模式中，核心的工厂类不再负责所有的对象的创建，而是将具体创建的工作交给子类去做。
     * 这个核心类则摇身一变，成为了一个抽象工厂角色，仅负责给出具体工厂子类必须实现的接口，而不接触哪一个类应当被实例化这种细节。
     */
    @Test
    public void method1(){
        String data = "";
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile exportFile = exportFactory.factory("financial");
        exportFile.export(data);
    }

    /***
     * 工厂方法模式和简单工厂模式
     * 工厂方法模式和简单工厂模式在结构上的不同很明显。工厂方法模式的核心是一个抽象工厂类，而简单工厂模式把核心放在一个具体类上。
     *
     * 工厂方法模式退化后可以变得很像简单工厂模式。
     * 设想如果非常确定一个系统只需要一个具体工厂类，那么不妨把抽象工厂类合并到具体工厂类中去。由于只有一个具体工厂类，所以不妨将工厂方法改为静态方法，这时候就得到了简单工厂模式。
     *
     * 如果系统需要加入一个新的导出类型，那么所需要的就是向系统中加入一个这个导出类以及所对应的工厂类。
     * 没有必要修改客户端，也没有必要修改抽象工厂角色或者其他已有的具体工厂角色。对于增加新的导出类型而言，这个系统完全支持“开-闭原则”。
     */
}
