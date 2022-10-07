package org.example.Actividad4_2.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.file.Path;

public interface FileDAO {

    void readFile(String file) throws FileNotFoundException;

    Integer requestNewInt();

    void insertIntegerIntoFile(Integer newInt) throws FileNotFoundException;
}