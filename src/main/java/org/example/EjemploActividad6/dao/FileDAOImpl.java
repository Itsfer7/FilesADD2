package org.example.EjemploActividad6.dao;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.example.EjemploActividad6.entity.ComicInfoEntity;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

public class FileDAOImpl implements FileDAO {


    @Override
    public void createExcelInDisk(Workbook workbook, String excelFilePath) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(excelFilePath)) {
            workbook.write(fileOutputStream);
            System.out.println("Excel creado en " + excelFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}