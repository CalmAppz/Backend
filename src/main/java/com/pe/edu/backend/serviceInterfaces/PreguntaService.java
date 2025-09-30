package com.pe.edu.backend.serviceInterfaces;

import com.pe.edu.backend.entities.Pregunta;
import java.util.List;

public interface PreguntaService {
    Pregunta insert(Pregunta pregunta);
    List<Pregunta> list();
    void delete(int id);
    void update(Pregunta pregunta);
}
