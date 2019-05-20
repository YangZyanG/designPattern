package com.example.designpattern.demo.factoryMethod.factory;

import com.example.designpattern.demo.factoryMethod.abstractFactory.ExportFactory;
import com.example.designpattern.demo.factoryMethod.service.ExportFile;
import com.example.designpattern.demo.factoryMethod.service.impl.ExportFinancialHtmlFile;
import com.example.designpattern.demo.factoryMethod.service.impl.ExportStandardHtmlFile;

/***
 * 具体工厂角色类
 */
public class ExportHtmlFactory implements ExportFactory {

    @Override
    public ExportFile factory(String type) {

        if("standard".equals(type))
            return new ExportStandardHtmlFile();
        else if ("financial".equals(type))
            return new ExportFinancialHtmlFile();
        else
            throw new RuntimeException("没有找到对象");

    }
}
