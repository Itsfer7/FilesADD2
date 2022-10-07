package org.example.Actividad5.dao;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class FileDAOImpl implements FileDAO {


    @Override
    public RandomAccessFile readFile(RandomAccessFile file) {
        return file;
    }

    @Override
    public Integer requestPosition(RandomAccessFile file) {
        return null;
    }

    @Override
    public RandomAccessFile readRequestedInt(RandomAccessFile file, Integer requestPosition) {
        return file;
    }

    @Override
    public Integer requestNewInt() {
        return null;
    }

    @Override
    public RandomAccessFile updateIntegerIntoFileOnGivenPosition(RandomAccessFile file, Integer requestPosition, Integer newInt) throws FileNotFoundException {
        return new RandomAccessFile("enteros.dat", "rw");
    }
}