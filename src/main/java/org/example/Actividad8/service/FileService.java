package org.example.Actividad8.service;

import org.example.Actividad8.dao.FileDAO;
import org.example.Actividad8.dao.FileDAOImpl;

import java.io.*;

public class FileService {

    FileDAO fileDAO = new FileDAOImpl();

    public void createBothFiles(String nombreFicheroResultadoDirectorios , String nombreFicheroResultadoFicheros, File mainFile) throws FileNotFoundException {
        fileDAO.createFileWithDirectories(nombreFicheroResultadoDirectorios, mainFile);
        fileDAO.createFileWithFiles(nombreFicheroResultadoFicheros, mainFile);
    }
}
