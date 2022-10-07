package org.example.EjemploActividad6.dao;

import org.apache.poi.ss.usermodel.Workbook;

public interface ExcelDAO {

    void createExcelInDisk(Workbook workbook, String excelFilePath);
}
