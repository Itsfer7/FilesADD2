package org.example.Actividad1.app;

import org.example.Actividad1.service.FileService;

public class FileExample {

    public static void main(String[] args) {
        FileService fileService = new FileService();
        fileService.listFiles();
    }
}