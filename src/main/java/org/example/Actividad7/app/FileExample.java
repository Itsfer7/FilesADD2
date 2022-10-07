package org.example.Actividad7.app;

import org.example.Actividad7.service.FileService;

public class FileExample {

    public static void main(String[] args) {
        FileService fileService = new FileService();

        fileService.listAndWriteFiles();
        fileService.readFile();
    }
}