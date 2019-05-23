package com.example.designpattern.demo.bridge;

import com.example.designpattern.demo.bridge.abstract_.AbstractMessage;
import com.example.designpattern.demo.bridge.abstraction.CommonMessage;
import com.example.designpattern.demo.bridge.abstraction.UrgencyMessage;
import com.example.designpattern.demo.bridge.service.MessageImplementor;
import com.example.designpattern.demo.bridge.service.impl.MessageEmail;
import com.example.designpattern.demo.bridge.service.impl.MessageSMS;
import org.junit.Test;

/***
 * 桥梁模式
 * 桥梁模式是对象的结构模式。又称为柄体(Handle and Body)模式或接口(Interface)模式。
 * 桥梁模式的用意是“将抽象化(Abstraction)与实现化(Implementation)脱耦，使得二者可以独立地变化”。
 */
public class day01 {

    /***
     * 桥梁模式的用意
     * 桥梁模式虽然不是一个使用频率很高的模式，但是熟悉这个模式对于理解面向对象的设计原则，包括“开-闭”原则以及组合/聚合复用原则都很有帮助。理解好这两个原则，有助于形成正确的设计思想和培养良好的设计风格。
     * 桥梁模式的用意是“将抽象化(Abstraction)与实现化(Implementation)脱耦，使得二者可以独立地变化”。这句话很短，但是第一次读到这句话的人很可能都会思考良久而不解其意。
     * 这句话有三个关键词，也就是抽象化、实现化和脱耦。理解这三个词所代表的概念是理解桥梁模式用意的关键。
     *
     * 1.抽象化
     * 从众多的事物中抽取出共同的、本质性的特征，而舍弃其非本质的特征，就是抽象化。
     * 通常情况下，一组对象如果具有相同的特征，那么它们就可以通过一个共同的类来描述。如果一些类具有相同的特征，往往可以通过一个共同的抽象类来描述。
     *
     * 2.实现化
     * 抽象化给出的具体实现，就是实现化。
     * 一个类的实例就是这个类的实例化，一个具体子类是它的抽象超类的实例化。
     *
     * 3.脱耦
     * 所谓耦合，就是两个实体的行为的某种强关联。而将它们的强关联去掉，就是耦合的解脱，或称脱耦。
     * 在这里，脱耦是指将抽象化和实现化之间的耦合解脱开，或者说是将它们之间的强关联改换成弱关联。
     * 所谓强关联，就是在编译时期已经确定的，无法在运行时期动态改变的关联；所谓弱关联，就是可以动态地确定并且可以在运行时期动态地改变的关联。
     * 显然，在Java语言中，继承关系是强关联，而聚合关系是弱关联。
     * 将两个角色之间的继承关系改为聚合关系，就是将它们之间的强关联改换成为弱关联。
     * 因此，桥梁模式中的所谓脱耦，就是指在一个软件系统的抽象化和实现化之间使用聚合关系而不是继承关系，从而使两者可以相对独立地变化。这就是桥梁模式的用意。
     */

    /***
     * 使用场景
     * 考虑这样一个实际的业务功能：发送提示消息。基本上所有带业务流程处理的系统都会有这样的功能，比如OA上有尚未处理完毕的文件，需要发送一条消息提示他。
     * 从业务上看，消息又分成普通消息、加急消息和特急消息多种，不同的消息类型，业务功能处理是不一样的。
     * 比如加急消息是在消息上添加加急，而特急消息除了添加特急外，还会做一条催促的记录，多久不完成会继续催促；从发送消息的手段上看，又有系统内短消息、手机短信息、邮件等。
     */
    @Test
    public void method1(){
        //创建具体的实现对象
        MessageImplementor implementor = new MessageSMS();
        //创建普通消息对象
        AbstractMessage message = new CommonMessage(implementor);
        message.sendMessage("加班申请速批","李总");

        implementor = new MessageEmail();
        message = new UrgencyMessage(implementor);
        message.sendMessage("加班申请速批","李总");
    }
}
