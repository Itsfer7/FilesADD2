package org.example.Actividad7.dao;

import java.io.File;
import java.io.RandomAccessFile;

public class FileDAOImpl implements FileDAO {


    @Override
    public RandomAccessFile listAndWriteFiles(String directory) {
        return new RandomAccessFile(directory, "rw");
    }

    @Override
    public void readFile(RandomAccessFile finalFile) {

    }
}