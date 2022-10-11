package org.example.Actividad8.app;

import org.example.Actividad8.service.FileService;

import java.io.File;
import java.io.IOException;

public class FileExample {
    private static final String NOMBRE_FICHERO_RESULTADO_FICHEROS = "/home/ivan/Actividad8_FicheroResultado_Ficheros.txt";
    private static final String NOMBRE_FICHERO_RESULTADO_DIRECTORIOS = "/home/ivan/Actividad8_FicheroResultado_Directorios.txt";


    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        File mainFile = new File(fileName);
        FileService fileService = new FileService();
        fileService.createBothFiles(NOMBRE_FICHERO_RESULTADO_DIRECTORIOS, NOMBRE_FICHERO_RESULTADO_FICHEROS, mainFile);
    }
}
