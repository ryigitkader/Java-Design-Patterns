package com.company.designpatterns.factory;

class PdfExporter implements IFileExporter{

    @Override
    public String export(String content) {
        return "Pdf = "+content;
    }
}
