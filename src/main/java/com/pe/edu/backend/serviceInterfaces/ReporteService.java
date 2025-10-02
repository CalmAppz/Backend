package com.pe.edu.backend.serviceInterfaces;

import com.pe.edu.backend.entities.Reporte;
import com.pe.edu.backend.entities.TestsPsicologico;

import java.util.List;

public interface ReporteService {
    Reporte insert(Reporte reporte);
    List<Reporte> list();
    void delete(int id);
    void update(Reporte reporte);
    public Reporte listarId(int id);
}
