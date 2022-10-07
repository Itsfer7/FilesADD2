package org.example.Actividad6.app;

import org.apache.log4j.BasicConfigurator;
import org.example.Actividad6.entity.Superhero;
import org.example.Actividad6.service.FileService;

import java.io.IOException;
import java.util.List;

public class FileExample {

    public static void main(String[] args) throws IOException {
        BasicConfigurator.configure();

        FileService fileService = new FileService();

        List<Superhero> listSuperhero = fileService.getList();
        String excelFilePath = "/home/ivan/Superheroes.xlsx";

        fileService.writeExcel(listSuperhero, excelFilePath);
    }
}