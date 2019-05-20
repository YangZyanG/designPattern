package com.example.designpattern.demo.factoryMethod.service.impl;

import com.example.designpattern.demo.factoryMethod.service.ExportFile;

/***
 * 具体导出角色类，通常情况下这个类会有复杂的业务逻辑。
 */
public class ExportFinancialHtmlFile implements ExportFile {

    @Override
    public boolean export(String data) {

        System.out.println("导出财务版HTML文件");
        return true;
    }
}
