package com.example.designpattern.demo.singleton;

/***
 * 双重检查加锁
 * 所谓“双重检查加锁”机制，指的是：并不是每次进入getInstance方法都需要同步，而是先不同步，进入方法后，先检查实例是否存在，如果不存在才进行下面的同步块，这是第一重检查。
 * 进入同步块过后，再次检查实例是否存在，如果不存在，就在同步的情况下创建一个实例，这是第二重检查。
 * 这样一来，就只需要同步一次了，从而减少了多次在同步情况下进行判断所浪费的时间。
 *
 * “双重检查加锁”机制的实现会使用关键字volatile，从而确保多个线程能正确的处理该变量。
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton singleton;

    private DoubleCheckSingleton(){

    }

    /***
     * 这种实现方式既可以实现线程安全地创建实例，而又不会对性能造成太大的影响。它只是第一次创建实例的时候同步，以后就不需要同步了，从而加快了运行速度。
     * 由于volatile关键字可能会屏蔽掉虚拟机中一些必要的代码优化，所以运行效率并不是很高。因此一般建议，没有特别的需要，不要使用。
     * 也就是说，虽然可以使用“双重检查加锁”机制来实现线程安全的单例，但并不建议大量采用，可以根据情况来选用。
     * @return
     */
    public static DoubleCheckSingleton getInstance(){

        //这里singleton实例需要用volitile关键字修饰
        //因为volatile关键字会保证顺序性，避免线程拿到未创建完的对象
        if(null == singleton){
            synchronized (DoubleCheckSingleton.class){
                if(null == singleton)
                    singleton = new DoubleCheckSingleton();
            }
        }

        return singleton;
    }
}
