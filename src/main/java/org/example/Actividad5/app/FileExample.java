package org.example.Actividad5.app;

import org.example.Actividad5.service.FileService;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileExample {

    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("enteros.dat", "rw");

        FileService fileService = new FileService();

        fileService.readFile(file);
        Integer requestPosition = fileService.requestPosition(file);
        fileService.readRequestedInt(file, requestPosition);
        Integer newInt = fileService.requestNewInt();
        fileService.updateIntegerIntoFileOnGivenPosition(file, requestPosition, newInt);
        fileService.readFile(file);
    }
}