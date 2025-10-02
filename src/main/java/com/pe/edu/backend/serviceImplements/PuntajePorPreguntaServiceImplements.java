package com.pe.edu.backend.serviceImplements;

import com.pe.edu.backend.entities.PuntajesPorPregunta;
import com.pe.edu.backend.entities.TestsPsicologico;
import com.pe.edu.backend.repositories.IPuntajesPorPreguntaRepository;
import com.pe.edu.backend.serviceInterfaces.PuntajePorPreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PuntajePorPreguntaServiceImplements implements PuntajePorPreguntaService {

    @Autowired
    private IPuntajesPorPreguntaRepository puntajesPorPreguntaRepository;

    @Override
    public PuntajesPorPregunta insert(PuntajesPorPregunta puntajePorPregunta) {
        return puntajesPorPreguntaRepository.save(puntajePorPregunta);
    }

    @Override
    public List<PuntajesPorPregunta> list() {
        return puntajesPorPreguntaRepository.findAll();
    }

    @Override
    public void delete(int id) {
        puntajesPorPreguntaRepository.deleteById(id);
    }

    @Override
    public void update(PuntajesPorPregunta puntajePorPregunta) {
        puntajesPorPreguntaRepository.save(puntajePorPregunta);
    }

    @Override
    public PuntajesPorPregunta listarId(int id) {
        return puntajesPorPreguntaRepository.findById(id).orElse(new PuntajesPorPregunta());
    }
}
