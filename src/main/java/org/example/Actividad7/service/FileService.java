package org.example.Actividad7.service;

import org.example.Actividad7.dao.FileDAO;
import org.example.Actividad7.dao.FileDAOImpl;
import org.example.Actividad7.entity.FileInfoEntity;

import java.io.*;
import java.util.List;

public class FileService {

    FileDAO fileDAO = new FileDAOImpl();

    public void createFileWithFileList(String nombreFicheroResultado, String folderName) {
        File folder = new File(folderName);
        if (folder.exists() && folder.isDirectory()) {
            List<FileInfoEntity> fileInfoEntityList = fileDAO.createInfoFile(folder);
            fileDAO.crearListado(fileInfoEntityList, nombreFicheroResultado);
        } else {
            System.out.println("El directorio no existe o no es una carpeta");
            throw new RuntimeException();
        }
    }
}