package org.example.EjemploActividad6.service;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.example.EjemploActividad6.dao.FileDAO;
import org.example.EjemploActividad6.dao.FileDAOImpl;
import org.example.EjemploActividad6.entity.ComicInfoEntity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
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
        List<ComicInfoEntity> comicInfoEntity = loadInfo();
        try (Workbook workbook = new HSSFWorkbook()) {
            Sheet sheet = workbook.createSheet();
            createHeader(sheet, workbook.createCellStyle(), workbook.createFont());
            createRows(comicInfoEntity, sheet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createRows(List<ComicInfoEntity> comicInfoEntityList, Sheet sheet) {
        int rowCount = 0;
        for (int i = 0; i < comicInfoEntityList.size(); i++) {
            ComicInfoEntity comicInfoEntity = comicInfoEntityList.get(i);
            Row row = sheet.createRow(++i);
            Cell cell = row.createCell(0);
            RichTextString text = new XSSFRichTextString(comicInfoEntity.getName());
            cell.setCellValue(text);

            cell = row.createCell(1);
            text = new XSSFRichTextString(comicInfoEntity.getCompany());
            cell.setCellValue(text);

            cell = row.createCell(2);
            text = new XSSFRichTextString(comicInfoEntity.getCreator());
            cell.setCellValue(text);

            cell = row.createCell(3);
            text = new XSSFRichTextString(comicInfoEntity.getFirstApparition());
            cell.setCellValue(text);

            cell = row.createCell(4);
            text = new XSSFRichTextString(comicInfoEntity.getDateApparition());
            cell.setCellValue(text);
        }
    }

    private void createHeader(Sheet sheet, CellStyle cellStyle, Font font) {
        cellStyle.setFillBackgroundColor(IndexedColors.BLACK.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        font.setColor(IndexedColors.WHITE.getIndex());
        font.setBold(true);

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        RichTextString text = new XSSFRichTextString("Super Héroe");
        cell.setCellValue(text);
        cell.setCellStyle(cellStyle);

        row.createCell(1);
        text = new XSSFRichTextString("Compañia");
        cell.setCellValue(text);
        cell.setCellStyle(cellStyle);

        row.createCell(2);
        text = new XSSFRichTextString("Creador");
        cell.setCellValue(text);
        cell.setCellStyle(cellStyle);

        row.createCell(3);
        text = new XSSFRichTextString("Primera aparición");
        cell.setCellValue(text);
        cell.setCellStyle(cellStyle);

        row.createCell(4);
        text = new XSSFRichTextString("Fecha de aparición");
        cell.setCellValue(text);
        cell.setCellStyle(cellStyle);
    }

    private List<ComicInfoEntity> loadInfo() {
        List<ComicInfoEntity> comicInfoEntity = new ArrayList<>();
        comicInfoEntity.add(new ComicInfoEntity("SpiderMan", "Marvel", "Stan Lee y Steve Ditko", "Amazing Fantasy #15", "Agosto de 1962"));
        comicInfoEntity.add(new ComicInfoEntity("Superman", "DC", "Jerry Siegel y Joe Shuster", "Action Comics #1", "Junio de 1938"));
        comicInfoEntity.add(new ComicInfoEntity("Batman", "DC", "Bob Kane y Bill Finger", "Detective Comics #27", "Marzo de 1939"));
        comicInfoEntity.add(new ComicInfoEntity("Iron Man", "Marvel", "Stan Lee, Larry Lieber, Don Heck y Jack Kirby", "Tales of Suspense #39", "Marzo de 1963"));
        return comicInfoEntity;
    }

}