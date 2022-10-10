package org.example.Actividad7.entity;

import java.util.ArrayList;
import java.util.List;

public class FileInfoEntity {

    public static final String SEPARATOR = ";";

    private String name;
    private String type;
    private List<String> permissions;
    private long size;

    public FileInfoEntity() {
        // Se inicializa la lista de permisos para que no sea null
        super();
        this.permissions = new ArrayList<>();
    }

    public FileInfoEntity(String name, String type, List<String> permissions, long size) {
        this.name = name;
        this.type = type;
        this.permissions = permissions;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}