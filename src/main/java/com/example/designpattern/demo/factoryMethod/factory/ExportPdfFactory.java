package com.example.designpattern.demo.factoryMethod.factory;

import com.example.designpattern.demo.factoryMethod.abstractFactory.ExportFactory;
import com.example.designpattern.demo.factoryMethod.service.ExportFile;
import com.example.designpattern.demo.factoryMethod.service.impl.ExportFinancialPdfFile;
import com.example.designpattern.demo.factoryMethod.service.impl.ExportStandardPdfFile;

/***
 * 具体工厂角色类
 */
public class ExportPdfFactory implements ExportFactory {

    @Override
    public ExportFile factory(String type) {

        if("standard".equals(type))
            return new ExportStandardPdfFile();
        else if ("financial".equals(type))
            return new ExportFinancialPdfFile();
        else
            throw new RuntimeException("没有找到对象");

    }
}
