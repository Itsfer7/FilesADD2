package org.example.Actividad1.dao;

import java.io.File;

public class FileDAOImpl implements FileDAO {

    public File[] listFiles(String directory) {
        File path = new File(directory);
        return path.listFiles();
    }
}