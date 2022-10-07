package org.example.Actividad7.dao;

import java.io.RandomAccessFile;

public interface FileDAO {
    RandomAccessFile listAndWriteFiles(String directory);
    void readFile(RandomAccessFile finalFile);
}
