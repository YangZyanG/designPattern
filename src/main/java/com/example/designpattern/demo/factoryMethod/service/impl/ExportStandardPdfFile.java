package com.example.designpattern.demo.factoryMethod.service.impl;

import com.example.designpattern.demo.factoryMethod.service.ExportFile;

public class ExportStandardPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {

        System.out.println("导出标准PDF文件");
        return true;
    }
}
