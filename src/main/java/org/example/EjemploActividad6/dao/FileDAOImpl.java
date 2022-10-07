package org.example.EjemploActividad6.dao;

import org.apache.poi.sl.usermodel.Sheet;
import org.example.EjemploActividad6.entity.ComicInfoEntity;

import java.util.Arrays;
import java.util.List;

public class FileDAOImpl implements FileDAO {


    @Override
    public List<ComicInfoEntity> getList() {
        ComicInfoEntity superhero1 = new ComicInfoEntity("SpiderMan", "Marvel", "Stan Lee y Steve Ditko", "Amazing Fantasy #15", "Agosto de 1962");
        ComicInfoEntity superhero2 = new ComicInfoEntity("Superman", "DC", "Jerry Siegel y Joe Shuster", "Action Comics #1", "Junio de 1938");
        ComicInfoEntity superhero3 = new ComicInfoEntity("Batman", "DC", "Bob Kane y Bill Finger", "Detective Comics #27", "Marzo de 1939");
        ComicInfoEntity superhero4 = new ComicInfoEntity("Iron Man", "Marvel", "Stan Lee, Larry Lieber, Don Heck y Jack Kirby", "Tales of Suspense #39", "Marzo de 1963");

        return Arrays.asList(superhero1, superhero2, superhero3, superhero4);
    }


    @Override
    public void writeExcel(List<ComicInfoEntity> listSuperhero, String excelFilePath) {

    }

    @Override
    public void writeData(ComicInfoEntity superhero) {

    }

    @Override
    public void createHearderRow(Sheet sheet) {

    }
}