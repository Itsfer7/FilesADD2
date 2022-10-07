package org.example.Actividad4.service;

import org.example.Actividad4.dao.FileDAO;
import org.example.Actividad4.dao.FileDAOImpl;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileService {

    private final FileDAO fileDAO = new FileDAOImpl();

    public Integer requestNewInt() {
        Scanner scanner = new Scanner(System.in);
        Integer newInt = fileDAO.requestNewInt();
        System.out.println("Introduce un número entero para añadirlo al fichero: ");
        while (newInt == null) {
            try {
                newInt = scanner.nextInt();
            } catch (InputMismatchException exception) {
                scanner.nextLine();
                System.out.println("El valor introducido debe ser un número entero");
            }
        }
        return newInt;
    }

    public void readFile(RandomAccessFile file) throws FileNotFoundException {
        RandomAccessFile reader = fileDAO.readFile(file);
        System.out.println("Leyendo el fichero...");
        int i = 1;
        try {
            reader.seek(0);
            while (reader.getFilePointer() < reader.length()) {
                System.out.println((i) + ". " + file.readInt());
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public void insertIntegerIntoFile(RandomAccessFile file, Integer newInt) throws FileNotFoundException {
        RandomAccessFile reader = fileDAO.insertIntegerIntoFile(file, newInt);
        try {
            reader.seek(file.length());
            reader.writeInt(newInt);
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}