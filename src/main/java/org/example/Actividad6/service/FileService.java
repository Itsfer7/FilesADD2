package org.example.Actividad6.service;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.example.Actividad6.dao.FileDAO;
import org.example.Actividad6.dao.FileDAOImpl;
import org.example.Actividad6.entity.Superhero;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class FileService {

    private final FileDAO filedao = new FileDAOImpl();

    public List<Superhero> getList() {
        return filedao.getList();
    }

    public void writeExcel(List<Superhero> listSuperhero, String excelFilePath) throws IOException {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet();

        int rowCount = 0;

        for (Superhero superhero : listSuperhero) {
            Row row = sheet.createRow(++rowCount);
            writeData(superhero, row);
        }

        try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
            workbook.write(outputStream);
        }
    }

    public void writeData(Superhero superhero, Row row) {
        Cell cell = row.createCell(1);
        cell.setCellValue(superhero.getName());

        cell = row.createCell(2);
        cell.setCellValue(superhero.getCompany());

        cell = row.createCell(3);
        cell.setCellValue(superhero.getCreator());

        cell = row.createCell(4);
        cell.setCellValue(superhero.getFirstAparition());

        cell = row.createCell(5);
        cell.setCellValue(superhero.getDateAparition());
    }
}