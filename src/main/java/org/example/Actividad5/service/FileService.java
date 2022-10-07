package org.example.Actividad5.service;

import org.example.Actividad5.dao.FileDAO;
import org.example.Actividad5.dao.FileDAOImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileService {

    private final FileDAO fileDAO = new FileDAOImpl();
    
    public Integer requestPosition(RandomAccessFile file) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Integer requestedPosition = fileDAO.requestPosition(file);
        System.out.println("Introduce la posición del número que quieres editar: ");
        while (requestedPosition == null) {
            try {
                requestedPosition = scanner.nextInt();
                while (requestedPosition < 1 || requestedPosition > file.length() / 4) {
                    System.out.println("La posición del número debe ser mayor que 0 y debe existir en el fichero");
                    requestedPosition = scanner.nextInt();
                }
            } catch (InputMismatchException exception) {
                scanner.nextLine();
                System.out.println("La posición debe ser un número");
            }
        }
        return requestedPosition;
    }

    public void readRequestedInt(RandomAccessFile file, Integer requestedPosition) throws IOException {
        RandomAccessFile reader = fileDAO.readRequestedInt(file, requestedPosition);
        try {
            reader.seek(requestedPosition - 1);
            System.out.println("El número en la posición " + requestedPosition + " es: " + reader.readInt());
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public Integer requestNewInt() {
        Scanner scanner = new Scanner(System.in);
        Integer newInt = fileDAO.requestNewInt();
        System.out.println("Introduce un número entero para sobreescribir el anterior: ");
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

    public void updateIntegerIntoFileOnGivenPosition(RandomAccessFile file, Integer requestPosition, Integer newInt) throws FileNotFoundException {
        RandomAccessFile reader = fileDAO.updateIntegerIntoFileOnGivenPosition(file, requestPosition, newInt);
        try {
            reader.seek(requestPosition - 1);
            reader.writeInt(newInt);
            System.out.println("El número en la posición " + requestPosition + " ahora es: " + newInt);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public void readFile(RandomAccessFile file) throws FileNotFoundException {
        RandomAccessFile reader = fileDAO.readFile(file);
        System.out.println("Leyendo el fichero...");
        int i = 1;
        try {
            reader.seek(0);
            while (reader.getFilePointer() < reader.length()) {
                System.out.println(i + ". " + file.readInt());
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}