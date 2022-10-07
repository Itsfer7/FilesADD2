package org.example.Actividad3.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

public interface TextDAO {
    File createFile(String name, String text);
    BufferedReader readFile(File file) throws FileNotFoundException;
}
