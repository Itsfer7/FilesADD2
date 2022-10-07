package org.example.Actividad7.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class FileDAOImpl implements FileDAO {


    @Override
    public RandomAccessFile listAndWriteFiles(String directory) throws FileNotFoundException {
        return new RandomAccessFile(directory, "rw");
    }

    @Override
    public void readFile(RandomAccessFile finalFile) {

    }
}