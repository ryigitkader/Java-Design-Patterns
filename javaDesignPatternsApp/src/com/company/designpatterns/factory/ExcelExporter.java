package com.company.designpatterns.factory;

class ExcelExporter implements IFileExporter {
    @Override
    public String export(String content) {
        return "Excel = "+content;
    }
}
