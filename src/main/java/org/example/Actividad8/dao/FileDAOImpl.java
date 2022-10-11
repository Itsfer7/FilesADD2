package org.example.Actividad8.dao;

import java.io.*;

public class FileDAOImpl implements FileDAO {

    @Override
    public void createFileWithDirectories(String nombreFicheroResultadoDirectorios, File mainFile) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(mainFile));
        try (FileWriter fileWriter = new FileWriter(nombreFicheroResultadoDirectorios)) {
            String line = reader.readLine();
            while (line != null) {
                String fileOrDirectory = "";
                int i = line.indexOf(";");
                if (i != -1) {
                    fileOrDirectory = line.substring((i + 1));
                }
                if (fileOrDirectory.startsWith("D")) {
                    fileWriter.write(line + '\n');
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createFileWithFiles(String nombreFicheroResultadoFicheros, File mainFile) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(mainFile));
        try (FileWriter fileWriter = new FileWriter(nombreFicheroResultadoFicheros)) {
            String line = reader.readLine();
            while (line != null) {
                String fileOrDirectory = "";
                int i = line.indexOf(";");
                if (i != -1) {
                    fileOrDirectory = line.substring((i + 1));
                }
                if (fileOrDirectory.startsWith("F")) {
                    fileWriter.write(line + '\n');
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
