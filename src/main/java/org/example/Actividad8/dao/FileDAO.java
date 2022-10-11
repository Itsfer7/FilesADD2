package org.example.Actividad8.dao;

import java.io.File;
import java.io.FileNotFoundException;

public interface FileDAO {
    void createFileWithFiles(String nombreFicheroResultadoFicheros, File mainFile) throws FileNotFoundException;
    void createFileWithDirectories(String nombreFicheroResultadoDirectorios, File mainFile) throws FileNotFoundException;
}
