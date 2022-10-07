package org.example.Actividad7.service;

import org.example.Actividad7.dao.FileDAO;
import org.example.Actividad7.dao.FileDAOImpl;
import org.example.Actividad7.entity.FileEntity;

import java.io.*;

public class FileService {

    private final FileDAO filedao = new FileDAOImpl();

    public FileOutputStream listAndWriteFiles() throws FileNotFoundException {
        RandomAccessFile finalFile = filedao.listAndWriteFiles("/home/ivan/finalFile.txt", "rw");
        try {
            FileOutputStream writer = new FileOutputStream("/home/ivan/Actividad7.txt");
            for (File file : files) {
                FileEntity fileEntity = new FileEntity(file.getName() + " " + file.length(), file.isDirectory() ? "directory" : "file");
                if (file.isDirectory()) {
                    fileEntity.setType("directory");
                } else {
                    fileEntity.setType("file");
                }
                writer.write(("The file " + fileEntity.getName() + " is a " + fileEntity.getType()).getBytes());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return writer;
    }

    public void readFile(RandomAccessFile finalFile) throws FileNotFoundException {
        RandomAccessFile reader = fileDAO.readFile(finalFile);
        System.out.println("Leyendo el fichero...");
        int i = 1;
        try {
            reader.seek(0);
            while (reader.getFilePointer() < reader.length()) {
                System.out.println(i + ". " + finalFile.readInt());
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public void writeFile(RandomAccessFile file) throws FileNotFoundException {
        RandomAccessFile reader = fileDAO.updateIntegerIntoFileOnGivenPosition(file, requestPosition, newInt);
        try {
            reader.seek(requestPosition - 1);
            reader.writeInt(newInt);
            System.out.println("El número en la posición " + requestPosition + " ahora es: " + newInt);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}