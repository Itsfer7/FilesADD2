package org.example.Actividad8.app;

import org.example.Actividad8.service.FileService;

import java.util.Scanner;

public class FileExample {
    private static final String NOMBRE_FICHERO_RESULTADO_FICHEROS = "/home/ivan/Actividad7_FicheroResultado_Ficheros.txt";
    private static final String NOMBRE_FICHERO_RESULTADO_DIRECTORIOS = "/home/ivan/Actividad7_FicheroResultado_Directorios.txt";


    public static void main(String[] args) {
        //String fileName = args[0];
        //FileService fileService = new FileService();
        //fileService.createFileWithFiles(NOMBRE_FICHERO_RESULTADO_FICHEROS, fileName);
        //fileService.createFileWithDirectories(NOMBRE_FICHERO_RESULTADO_DIRECTORIOS, fileName);

        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();
        String value = "";
        System.out.println(opcion);
        int i = opcion.indexOf(";");
        if(i != -1){
            value = opcion.substring((i + 1));
        }
        if (value.startsWith("D")) {
            System.out.println("Directorio");
        } else if (value.startsWith("F")) {
            System.out.println("Fichero");
        } else {
            System.out.println("Error");
        }
    }
}
