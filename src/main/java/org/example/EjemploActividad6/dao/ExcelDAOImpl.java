package org.example.EjemploActividad6.dao;

import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDAOImpl implements ExcelDAO {


    @Override
    public void createExcelInDisk(Workbook workbook, String excelFilePath) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(excelFilePath)) {
            workbook.write(fileOutputStream);
            System.out.println("Excel creado en " + excelFilePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}