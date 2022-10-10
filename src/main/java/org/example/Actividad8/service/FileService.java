package org.example.Actividad8.service;

import org.example.Actividad7.entity.FileInfoEntity;

import java.io.File;
import java.util.List;

public class FileService {
    public void createFileWithFiles(String nombreFicheroResultadoFicheros, String fileName) {
        /*File folder = new File(fileName);
        if (folder.exists() && folder.isFile()) {
            List<FileInfoEntity> fileInfoEntityList = fileDAO.createInfoFile(folder);
            fileDAO.crearListadoFicheros(fileInfoEntityList, nombreFicheroResultado);
        } else {
            System.out.println("El directorio no existe o no es una carpeta");
            throw new RuntimeException();
        }*/
    }

    public void createFileWithDirectories(String nombreFicheroResultadoDirectorios, String fileName) {
        /*File folder = new File(fileName);
        if (folder.exists() && folder.isFile()) {
            List<FileInfoEntity> fileInfoEntityList = fileDAO.createInfoFile(folder);
            fileDAO.crearListadoDirectorios(fileInfoEntityList, nombreFicheroResultado);
        } else {
            System.out.println("El directorio no existe o no es una carpeta");
            throw new RuntimeException();
        }*/
    }
}
