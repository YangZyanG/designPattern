package com.example.designpattern.demo.builder;

import com.example.designpattern.demo.builder.abstractBuilder.Builder;
import com.example.designpattern.demo.builder.abstractBuilder.MessageBuilder;
import com.example.designpattern.demo.builder.builder.ConcreteBuilder;
import com.example.designpattern.demo.builder.builder.WelcomeBuilder;
import com.example.designpattern.demo.builder.director.Director;
import com.example.designpattern.demo.builder.director.MessageDirector;
import com.example.designpattern.demo.builder.entity.InsuranceContract;
import com.example.designpattern.demo.builder.entity.Product;
import org.junit.Test;

/***
 * 建造模式
 * 建造模式是对象的创建模式。
 * 建造模式可以将一个产品的内部表象（internal representation）与产品的生产过程分割开来，从而可以使一个建造过程生成具有不同的内部表象的产品对象。
 */
public class day01 {

    /***
     * 对象性质的建造
     * 有些情况下，一个对象会有一些重要的性质，在它们没有恰当的值之前，对象不能作为一个完整的产品使用。
     * 比如，一个电子邮件有发件人地址、收件人地址、主题、内容、附录等部分，而在最起码的收件人地址得到赋值之前，这个电子邮件不能发送。
     * 有些情况下，一个对象的一些性质必须按照某个顺序赋值才有意义。在某个性质没有赋值之前，另一个性质则无法赋值。
     *
     * 建造模式利用一个导演者对象和具体建造者对象一个个地建造出所有的零件，从而建造出完整的产品对象。
     * 建造者模式将产品的结构和产品的零件的建造过程对客户端隐藏起来，把对建造过程进行指挥的责任和具体建造者零件的责任分割开来，达到责任划分和封装的目的。
     */

    /***
     * 一下为建造模式演示，无场景
     * 客户端负责创建导演者和具体建造者对象。然后，客户端把具体建造者对象交给导演者，导演者操作具体建造者，开始创建产品。当产品完成后，建造者把产品返还给客户端。
     * 把创建具体建造者对象的任务交给客户端而不是导演者对象，是为了将导演者对象与具体建造者对象的耦合变成动态的，从而使导演者对象可以操纵数个具体建造者对象中的任何一个。
     */
    @Test
    public void method1(){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.result();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }

    /***
     * 使用场景
     * 假设有一个电子杂志系统，定期地向用户的电子邮件信箱发送电子杂志。用户可以通过网页订阅电子杂志，也可以通过网页结束订阅。
     * 当客户开始订阅时，系统发送一个电子邮件表示欢迎，当客户结束订阅时，系统发送一个电子邮件表示欢送。本例子就是这个系统负责发送“欢迎”和“欢送”邮件的模块。
     */
    @Test
    public void method2(){
        MessageBuilder builder = new WelcomeBuilder();
        MessageDirector director = new MessageDirector(builder);
        director.construct("wangyi@163.com", "183243005@qq.com");
    }

    /***
     * 建造模式分成两个很重要的部分：
     * 1.一个部分是Builder接口，这里是定义了如何构建各个部件，也就是知道每个部件功能如何实现，以及如何装配这些部件到产品中去；
     * 2.另外一个部分是Director，Director是知道如何组合来构建产品，也就是说Director负责整体的构建算法，而且通常是分步骤地来执行。
     *
     * 不管如何变化，建造模式都存在这么两个部分，一个部分是部件构造和产品装配，另一个部分是整体构建的算法。
     * 认识这点是很重要的，因为在建造模式中，强调的是固定整体构建的算法，而灵活扩展和切换部件的具体构造和产品装配的方式。
     * 再直白点说，建造模式的重心在于分离构建算法和具体的构造实现，从而使得构建算法可以重用。具体的构造实现可以很方便地扩展和切换，从而可以灵活地组合来构造出不同的产品对象。
     */

    /***
     * 使用建造模式构建复杂对象
     * 考虑这样一个实际应用，要创建一个保险合同的对象，里面很多属性的值都有约束，要求创建出来的对象是满足这些约束规则的。
     * 约束规则比如：
     * 保险合同通常情况下可以和个人签订，也可以和某个公司签订，但是一份保险合同不能同时与个人和公司签订。
     *
     * 这个对象里有很多类似这样的约束，采用建造模式来构建复杂的对象，通常会对建造模式进行一定的简化，因为目标明确，就是创建某个复杂对象，因此做适当简化会使程序更简洁。
     */
    @Test
    public void method3(){
        InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("9527", 123L, 456L);
        InsuranceContract contract = builder.setPersonName("小明").setOtherData("test").build();
        contract.someOperation();
    }
}