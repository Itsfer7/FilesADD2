package org.example.Actividad4.app;

import org.example.Actividad4.service.FileService;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileExample {

    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("enteros.dat", "rw");

        FileService fileService = new FileService();

        fileService.readFile(file);
        Integer newInt = fileService.requestNewInt();
        fileService.insertIntegerIntoFile(file, newInt);
        fileService.readFile(file);
    }
}