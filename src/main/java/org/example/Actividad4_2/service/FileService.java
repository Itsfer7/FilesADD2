package org.example.Actividad4_2.service;

import org.example.Actividad4_2.dao.FileDAO;
import org.example.Actividad4_2.dao.FileDAOImpl;

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

    public void readFile(String path) throws FileNotFoundException {
        System.out.println("Leyendo el fichero...");
        try (FileInputStream reader = new FileInputStream(path)) {
            byte[] bytes = reader.readAllBytes();
            for (byte b : bytes) {
            System.out.print(b + " ");
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public void insertIntegerIntoFile(Integer newInt) {
        System.out.println("Insertando el número " + newInt + " en el fichero...");

        try (FileOutputStream writer = new FileOutputStream("enteros2_copy.dat", true)) {
            writer.write(newInt);
        } catch (IOException e) {
            throw new RuntimeException();
        }

        System.out.println("Leyendo el fichero...");
        try (FileInputStream reader = new FileInputStream("enteros2_copy.dat")) {
            byte[] bytes = reader.readAllBytes();
            for (byte b : bytes) {
                System.out.print(b + " ");
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}