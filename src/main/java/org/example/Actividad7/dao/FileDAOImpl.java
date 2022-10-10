package org.example.Actividad7.dao;

import org.example.Actividad7.entity.FileInfoEntity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileDAOImpl implements FileDAO {


    @Override
    public List<FileInfoEntity> createInfoFile(File folder) {
        for (File file : folder.listFiles()) {
            FileInfoEntity fileInfoEntity = new FileInfoEntity();
            fileInfoEntity.setName(file.getName());
            if (file.isDirectory()) {
                fileInfoEntity.setType("D");
            } else {
                fileInfoEntity.setType("F");
            }
        }
        return new ArrayList<>();
    }
}