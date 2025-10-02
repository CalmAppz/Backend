package com.pe.edu.backend.serviceInterfaces;

import com.pe.edu.backend.entities.PuntajesPorPregunta;
import com.pe.edu.backend.entities.TestsPsicologico;

import java.util.List;

public interface PuntajePorPreguntaService {
    PuntajesPorPregunta insert(PuntajesPorPregunta puntajePorPregunta);
    List<PuntajesPorPregunta> list();
    void delete(int id);
    void update(PuntajesPorPregunta puntajePorPregunta);
    public PuntajesPorPregunta listarId(int id);
}
