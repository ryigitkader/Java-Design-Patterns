package com.company.designpatterns.factory;

public class Run {
    public static void main(String[] args) {

        String file = FileExporterFactory.getINSTANCE(FileExporterFactory.FileType.PDF).export("Any content");
        System.out.println(file);
    }
}
