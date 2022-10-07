package org.example.EjemploActividad6.dao;

import org.apache.poi.sl.usermodel.Sheet;
import org.example.EjemploActividad6.entity.ComicInfoEntity;

import java.util.List;

public interface FileDAO {

    List<ComicInfoEntity> getList();
    void writeExcel(List<ComicInfoEntity> listSuperhero, String excelFilePath);
    void writeData(ComicInfoEntity superhero);

    void createHearderRow(Sheet sheet);
}
