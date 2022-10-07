package org.example.Actividad7.dao;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public interface FileDAO {
    RandomAccessFile listAndWriteFiles(String directory) throws FileNotFoundException;
    void readFile(RandomAccessFile finalFile);
}
