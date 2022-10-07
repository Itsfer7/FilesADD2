package org.example.Actividad3.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TextDAOImpl implements TextDAO {


    @Override
    public File createFile(String name, String text) {
        return new File("/home/ivan/" + name);
    }

    @Override
    public BufferedReader readFile(File file) throws FileNotFoundException {
        return new BufferedReader(new FileReader(file));
    }
}