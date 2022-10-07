package org.example.Actividad6.dao;

import org.example.Actividad6.entity.Superhero;

import java.util.List;

public interface FileDAO {

    List<Superhero> getList();
    void writeExcel(List<Superhero> listSuperhero, String excelFilePath);
    void writeData(Superhero superhero);
}
