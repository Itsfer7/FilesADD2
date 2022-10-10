package org.example.EjemploActividad6.app;

import org.example.EjemploActividad6.service.ExcelService;

public class ExcelExample {

    private static final String EXCEL_FILE_PATH = "/home/ivan/Actividad6_Superheroes.xlsx";

    public static void main(String[] args) {
        ExcelService excelService = new ExcelService();
        excelService.createExcelFile(EXCEL_FILE_PATH);
    }
}