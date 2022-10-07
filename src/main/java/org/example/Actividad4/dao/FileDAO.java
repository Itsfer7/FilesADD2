package org.example.Actividad4.dao;

import java.io.*;

public interface FileDAO {

    RandomAccessFile readFile(RandomAccessFile file) throws FileNotFoundException;

    Integer requestNewInt();

    RandomAccessFile insertIntegerIntoFile(RandomAccessFile file, Integer newInt) throws FileNotFoundException;
}