package org.example.Actividad4.dao;

import java.io.*;

public class FileDAOImpl implements FileDAO {


    @Override
    public RandomAccessFile readFile(RandomAccessFile file) {
        return file;
    }

    @Override
    public Integer requestNewInt() {
        return null;
    }

    @Override
    public RandomAccessFile insertIntegerIntoFile(RandomAccessFile file, Integer newInt) throws FileNotFoundException {
        return new RandomAccessFile("enteros.dat", "rw");
    }
}