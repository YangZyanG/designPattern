package com.example.designpattern.demo.proxy;

import com.example.designpattern.demo.proxy.proxy.ProxyFactory;
import com.example.designpattern.demo.proxy.proxy.UserDaoProxy;
import com.example.designpattern.demo.proxy.service.UserDao;
import com.example.designpattern.demo.proxy.service.impl.UserDaoImpl;
import org.junit.Test;


/***
 * 代理(Proxy)是一种设计模式,提供了对目标对象另外的访问方式;即通过代理对象访问目标对象.这样做的好处是：可以在目标对象实现的基础上,增强额外的功能操作,即扩展目标对象的功能.
 * 这里使用到编程中的一个思想:不要随意去修改别人已经写好的代码或者方法,如果需改修改,可以通过代理的方式来扩展该方法。
 */
public class day01 {

    /***
     * 静态代理
     * 静态代理在使用时,需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者是继承相同父类.
     *
     * 总结：
     * 1.可以做到在不修改目标对象的功能前提下,对目标功能扩展.
     * 2.因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
     */
    @Test
    public void method1(){
        UserDao dao = new UserDaoImpl();
        UserDaoProxy proxy = new UserDaoProxy(dao);
        proxy.save();
    }

    /***
     * 动态代理
     * 动态代理有以下特点:
     * 1.代理对象,不需要实现接口
     * 2.代理对象的生成,是利用JDK的API,动态的在内存中构建代理对象(需要我们指定创建代理对象/目标对象实现的接口的类型)
     * 3.动态代理也叫做:JDK代理,接口代理
     */
    @Test
    public void method2(){
        UserDao dao = new UserDaoImpl();
        UserDao proxy = (UserDao) new ProxyFactory(dao).getProxyInstance();
        proxy.insert();
    }

    /***
     * Cglib
     * 上面的静态代理和动态代理模式都是要求目标对象是实现一个接口的目标对象。
     * 但是有时候目标对象只是一个单独的对象,并没有实现任何的接口,这个时候就可以使用以目标对象子类的方式类实现代理,这种方法就叫做:Cglib代理
     * Cglib代理,也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能的扩展。
     *
     * 1.JDK的动态代理有一个限制,就是使用动态代理的对象必须实现一个或多个接口,如果想代理没有实现接口的类,就可以使用Cglib实现.
     * 2.Cglib是一个强大的高性能的代码生成包,它可以在运行期扩展java类与实现java接口.它广泛的被许多AOP的框架使用,例如Spring AOP和synaop,为他们提供方法的interception(拦截)。
     *
     * Cglib子类代理实现方法:
     * 1.需要引入cglib的jar文件,但是Spring的核心包中已经包括了Cglib功能,所以直接引入spring-core-3.2.5.jar即可.
     * 2.引入功能包后,就可以在内存中动态构建子类
     * 3.代理的类不能为final,否则报错
     * 4.目标对象的方法如果为final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法.
     */


}
