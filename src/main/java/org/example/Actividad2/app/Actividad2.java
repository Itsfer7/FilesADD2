package org.example.Actividad2.app;

import org.example.Actividad2.exception.FileWithoutExtensionException;
import org.example.Actividad2.service.FileService;

public class Actividad2 {

    private static final String PATH = "C:\\temp\\ad\\ut2\\actividad1";

    public static void main(String[] args) throws FileWithoutExtensionException {
        FileService myServiceFile = new FileService();
        myServiceFile.renameFilesWithPermissions(PATH);

    }

}