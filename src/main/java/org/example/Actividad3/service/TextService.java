package org.example.Actividad3.service;

import org.example.Actividad3.dao.TextDAO;
import org.example.Actividad3.dao.TextDAOImpl;

import java.io.*;
import java.util.Scanner;

public class TextService {

    private final TextDAO textDAO = new TextDAOImpl();

    public String requestName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo a crear: ");
        return scanner.nextLine();
    }

    public String requestText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el texto a guardar en el archivo: ");
        return scanner.nextLine();
    }

    public File createFile(String name, String text) {
        File file = textDAO.createFile(name, text);
        try {
            Writer writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public void readFile(File file){
        try {
            BufferedReader reader1 = textDAO.readFile(file);
            String line;
            System.out.println("Leyendo el archivo: ");
            while ((line = reader1.readLine()) != null) {
                System.out.println(line);
            }
            reader1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}