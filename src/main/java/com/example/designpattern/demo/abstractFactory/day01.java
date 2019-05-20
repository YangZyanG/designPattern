package com.example.designpattern.demo.abstractFactory;

import com.example.designpattern.demo.abstractFactory.factory.IntelFactory;
import org.junit.Test;

/***
 * 抽象工厂模式
 */
public class day01 {

    /***
     * 场景问题
     * 举个生活中常见的例子-->组装电脑，我们在组装电脑的时候，通常需要选择一系列的配件，比如CPU、硬盘、内存、主板、电源、机箱等。为讨论使用简单点，只考虑选择CPU和主板的问题。
     * 事实上，在选择CPU的时候，面临一系列的问题，比如品牌、型号、针脚数目、主频等问题，只有把这些问题都确定下来，才能确定具体的CPU。
     * 同样，在选择主板的时候，也有一系列问题，比如品牌、芯片组、集成芯片、总线频率等问题，也只有这些都确定了，才能确定具体的主板。
     * 选择不同的CPU和主板，是每个客户在组装电脑的时候，向装机公司提出的要求，也就是我们每个人自己拟定的装机方案。
     * 在最终确定这个装机方案之前，还需要整体考虑各个配件之间的兼容性。
     * 比如：CPU和主板，如果使用Intel的CPU和AMD的主板是根本无法组装的。因为Intel的CPU针脚数与AMD主板提供的CPU插口不兼容，就是说如果使用Intel的CPU根本就插不到AMD的主板中，所以装机方案是整体性的，里面选择的各个配件之间是有关联的。
     * 对于装机工程师而言，他只知道组装一台电脑，需要相应的配件，但是具体使用什么样的配件，还得由客户说了算。
     * 也就是说装机工程师只是负责组装，而客户负责选择装配所需要的具体的配件。因此，当装机工程师为不同的客户组装电脑时，只需要根据客户的装机方案，去获取相应的配件，然后组装即可。
     */

    /***
     * 考虑客户的功能，需要选择自己需要的CPU和主板，然后告诉装机工程师自己的选择，接下来就等着装机工程师组装电脑了。
     * 对装机工程师而言，只是知道CPU和主板的接口，而不知道具体实现，很明显可以用上简单工厂模式或工厂方法模式。
     * 为了简单，这里选用简单工厂。客户告诉装机工程师自己的选择，然后装机工程师会通过相应的工厂去获取相应的实例对象。
     */

    /***
     * 简单工厂模式
     * CPU对象和主板对象其实是有关系的，需要相互匹配的。
     * 而下面的实现中，并没有维护这种关联关系，CPU和主板是由客户任意选择，这是有问题的，Intel和Amd并不兼容。
     * 所以这个问题得用抽象工厂模式。
     */
    @Test
    public void method1(){
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.makeComputer(1, 1);
        simpleFactory.makeComputer(1, 2);
    }

    /***
     * 抽象工厂模式
     */
    @Test
    public void method2(){
        AbstractFactory abstractFactory = new AbstractFactory();
        abstractFactory.makeComputer(new IntelFactory());
    }

    /***
     * 总结
     * 抽象工厂模式更适合于解决那种接口实现类之间有关联关系的问题。
     */
}
