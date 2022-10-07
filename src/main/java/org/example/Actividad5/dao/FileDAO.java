package org.example.Actividad5.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public interface FileDAO {

    RandomAccessFile readFile(RandomAccessFile file) throws FileNotFoundException;

    Integer requestPosition(RandomAccessFile file) throws IOException;

    RandomAccessFile readRequestedInt(RandomAccessFile file, Integer requestedPosition) throws IOException;

    Integer requestNewInt();

    RandomAccessFile updateIntegerIntoFileOnGivenPosition(RandomAccessFile file, Integer requestPosition, Integer newInt) throws FileNotFoundException;
}