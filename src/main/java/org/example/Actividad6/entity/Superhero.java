package org.example.Actividad6.entity;

public class Superhero {
    private String name;
    private String company;
    private String creator;
    private String firstAparition;
    private String dateAparition;

    public Superhero() {
    }

    public Superhero(String name, String company, String creator, String firstAparition, String dateAparition) {
        this.name = name;
        this.company = company;
        this.creator = creator;
        this.firstAparition = firstAparition;
        this.dateAparition = dateAparition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getFirstAparition() {
        return firstAparition;
    }

    public void setFirstAparition(String firstAparition) {
        this.firstAparition = firstAparition;
    }

    public String getDateAparition() {
        return dateAparition;
    }

    public void setDateAparition(String dateAparition) {
        this.dateAparition = dateAparition;
    }
}