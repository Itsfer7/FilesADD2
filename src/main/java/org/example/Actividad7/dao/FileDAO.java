package org.example.Actividad7.dao;

import org.example.Actividad7.entity.FileInfoEntity;

import java.io.File;
import java.util.List;

public interface FileDAO {
    List<FileInfoEntity> createInfoFile(File folder);
}
