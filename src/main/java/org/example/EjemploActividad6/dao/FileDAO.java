package org.example.EjemploActividad6.dao;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.example.EjemploActividad6.entity.ComicInfoEntity;

import java.util.List;

public interface FileDAO {

    void createExcelInDisk(Workbook workbook, String excelFilePath);

}
