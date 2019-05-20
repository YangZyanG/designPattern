package com.example.designpattern.demo.factoryMethod.service.impl;

import com.example.designpattern.demo.factoryMethod.service.ExportFile;

public class ExportStandardHtmlFile implements ExportFile {
    @Override
    public boolean export(String data) {

        System.out.println("导出标准HTML文件");
        return true;
    }
}
