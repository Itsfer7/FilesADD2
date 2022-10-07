package org.example.Actividad6.dao;

import org.example.Actividad6.entity.Superhero;

import java.util.Arrays;
import java.util.List;

public class FileDAOImpl implements FileDAO {


    @Override
    public List<Superhero> getList() {
        Superhero superhero1 = new Superhero("SpiderMan", "Marvel", "Stan Lee y Steve Ditko", "Amazing Fantasy #15", "Agosto de 1962");
        Superhero superhero2 = new Superhero("Superman", "DC", "Jerry Siegel y Joe Shuster", "Action Comics #1", "Junio de 1938");
        Superhero superhero3 = new Superhero("Batman", "DC", "Bob Kane y Bill Finger", "Detective Comics #27", "Marzo de 1939");
        Superhero superhero4 = new Superhero("Iron Man", "Marvel", "Stan Lee, Larry Lieber, Don Heck y Jack Kirby", "Tales of Suspense #39", "Marzo de 1963");

        return Arrays.asList(superhero1, superhero2, superhero3, superhero4);
    }


    @Override
    public void writeExcel(List<Superhero> listSuperhero, String excelFilePath) {

    }

    @Override
    public void writeData(Superhero superhero) {

    }
}