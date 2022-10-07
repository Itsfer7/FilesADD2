package org.example.Actividad4_2.app;

import org.example.Actividad4_2.service.FileService;

import java.io.IOException;

public class FileExample {

    public static void main(String[] args) throws IOException {
        String path = "enteros2.dat";

        FileService fileService = new FileService();

        fileService.readFile(path);
        Integer newInt = fileService.requestNewInt();
        fileService.insertIntegerIntoFile(newInt);
    }
}