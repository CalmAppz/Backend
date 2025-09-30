package com.pe.edu.backend.serviceImplements;

import com.pe.edu.backend.entities.Pregunta;
import com.pe.edu.backend.repositories.IPreguntaRepository;
import com.pe.edu.backend.serviceInterfaces.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntaServiceImplements implements PreguntaService {

    @Autowired
    private IPreguntaRepository iPreguntaRepository;

    @Override
    public Pregunta insert(Pregunta pregunta) {
        return iPreguntaRepository.save(pregunta);
    }

    @Override
    public List<Pregunta> list() {
        return iPreguntaRepository.findAll();
    }

    @Override
    public void delete(int id) {
        iPreguntaRepository.deleteById(id);
    }

    @Override
    public void update(Pregunta pregunta) {
        iPreguntaRepository.save(pregunta);
    }
}
