package org.example.EjemploActividad6.service;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.example.EjemploActividad6.dao.FileDAO;
import org.example.EjemploActividad6.dao.FileDAOImpl;
import org.example.EjemploActividad6.entity.ComicInfoEntity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelService {

    private final FileDAO filedao = new FileDAOImpl();

    public List<ComicInfoEntity> getList() {
        return filedao.getList();
    }

    public void writeExcel(List<ComicInfoEntity> listSuperhero, String excelFilePath) throws IOException {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet();

        int rowCount = 0;

        for (ComicInfoEntity superhero : listSuperhero) {
            Row row = sheet.createRow(++rowCount);
            writeData(superhero, row, sheet);
        }

        try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
            workbook.write(outputStream);
        }


    }

    public void writeData(ComicInfoEntity superhero, Row row, Sheet sheet) {

        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        Font font = sheet.getWorkbook().createFont();
        font.setBold(true);
        font.setFontHeightInPoints((short) 16);
        cellStyle.setFont(font);

        Cell cellSuperhero = row.createCell(1);
        cellSuperhero.setCellStyle(cellStyle);
        cellSuperhero.setCellValue("Super Héroe");

        Cell cellCompay = row.createCell(2);
        cellCompay.setCellStyle(cellStyle);
        cellCompay.setCellValue("Compañia");

        Cell cellCreator = row.createCell(3);
        cellCreator.setCellStyle(cellStyle);
        cellCreator.setCellValue("Creador");

        Cell cellFirstAparition = row.createCell(4);
        cellFirstAparition.setCellStyle(cellStyle);
        cellFirstAparition.setCellValue("Primera aparición");

        Cell cellDateAparition = row.createCell(5);
        cellDateAparition.setCellStyle(cellStyle);
        cellDateAparition.setCellValue("Fecha de aparición");



        Cell cell = row.createCell(1);
        cell.setCellValue(superhero.getName());

        cell = row.createCell(2);
        cell.setCellValue(superhero.getCompany());

        cell = row.createCell(3);
        cell.setCellValue(superhero.getCreator());

        cell = row.createCell(4);
        cell.setCellValue(superhero.getFirstApparition());

        cell = row.createCell(5);
        cell.setCellValue(superhero.getDateApparition());
    }

    public void createExcelFile(String excelFilePath) {
        ComicInfoEntity comicInfoEntity = new ComicInfoEntity();
    }

}