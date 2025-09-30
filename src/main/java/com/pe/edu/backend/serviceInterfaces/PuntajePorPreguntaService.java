package com.pe.edu.backend.serviceInterfaces;

import com.pe.edu.backend.entities.PuntajesPorPregunta;

import java.util.List;

public interface PuntajePorPreguntaService {
    PuntajesPorPregunta insert(PuntajesPorPregunta puntajePorPregunta);
    List<PuntajesPorPregunta> list();
    void delete(int id);
    void update(PuntajesPorPregunta puntajePorPregunta);
}
