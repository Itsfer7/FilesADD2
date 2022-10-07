package org.example.Actividad1.service;

import org.example.Actividad1.dao.FileDAO;
import org.example.Actividad1.dao.FileDAOImpl;
import org.example.Actividad1.entity.FileEntity;

import java.io.File;

public class FileService {

    private final FileDAO filedao = new FileDAOImpl();

    public void listFiles() {
        File[] files = filedao.listFiles("/home/ivan");
        for (File file : files) {
            FileEntity fileEntity = new FileEntity(file.getName() + " " + file.length(), file.isDirectory() ? "directory" : "file");
            if (file.isDirectory()) {
                fileEntity.setType("directory");
            } else {
                fileEntity.setType("file");
            }
            System.out.println("The file " + fileEntity.getName() + " is a " + fileEntity.getType());
        }
    }
}