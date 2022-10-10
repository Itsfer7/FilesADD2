package org.example.Actividad7.dao;

import org.example.Actividad7.entity.FileInfoEntity;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileDAOImpl implements FileDAO {

    @Override
    public List<FileInfoEntity> createInfoFile(File folder) {
        List<FileInfoEntity> fileInfoEntityList = new ArrayList<>();
        for (File file : folder.listFiles()) {
            FileInfoEntity fileInfoEntity = new FileInfoEntity();
            fileInfoEntity.setName(file.getName());
            if (file.isDirectory()) {
                fileInfoEntity.setType("D");
            } else {
                fileInfoEntity.setType("F");
            }
            // También se podría hacer de esta manera:
            // fileInfoEntity.setType(file.isDirectory() ? "D" : "F");
            if (file.canRead()) {
                fileInfoEntity.getPermissions().add("R");
            }
            if (file.canWrite()) {
                fileInfoEntity.getPermissions().add("W");
            }
            if (file.canExecute()) {
                fileInfoEntity.getPermissions().add("X");
            }
            fileInfoEntity.setSize(file.length());
            fileInfoEntityList.add(fileInfoEntity);
        }
        return fileInfoEntityList;
    }

    @Override
    public void crearListado(List<FileInfoEntity> fileInfoEntityList, String nombreFicheroResultado) {
       File ficheroResultado = new File(nombreFicheroResultado);
       try (PrintWriter printWriter = new PrintWriter(ficheroResultado)) {
           if (!ficheroResultado.exists()) {
               ficheroResultado.createNewFile();
           }
           for (FileInfoEntity fileInfoEntity : fileInfoEntityList) {
               System.out.println(fileInfoEntity.toPrint());
               printWriter.println(fileInfoEntity.toPrint());
           }
       } catch (Exception e) {
           System.err.println("Error al crear el fichero");
           System.err.println(e.getMessage());
       }
   }
}