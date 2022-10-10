package org.example.Actividad7.app;

import org.example.Actividad7.service.FileService;

public class FileExample {

    private static final String NOMBRE_FICHERO_RESULTADO = "/home/ivan/Actividad7_FicheroResultado.txt";


    public static void main(String[] args) {
        String folderName = args[0];
        FileService fileService = new FileService();
        fileService.createFileWithFileList(NOMBRE_FICHERO_RESULTADO, folderName);
    }
}