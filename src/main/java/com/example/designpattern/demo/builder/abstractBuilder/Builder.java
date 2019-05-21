package com.example.designpattern.demo.builder.abstractBuilder;

import com.example.designpattern.demo.builder.entity.Product;

/***
 * 给出一个抽象接口，以规范产品对象的各个组成成分的建造。
 */
public interface Builder {

    public void buildPart1();
    public void buildPart2();

    public Product result();
}
