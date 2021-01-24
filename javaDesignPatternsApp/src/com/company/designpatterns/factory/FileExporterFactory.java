package com.company.designpatterns.factory;

public class FileExporterFactory {

    public static IFileExporter getINSTANCE(FileType fileType){

        switch (fileType){

            case PDF:
                return new PdfExporter();
            case EXCEL:
                return new ExcelExporter();
            default:
                throw new UnsupportedOperationException();


        }


    }

    public enum FileType {
        PDF,
        EXCEL
    }
}
