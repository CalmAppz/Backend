package com.pe.edu.backend.repositories;

import com.pe.edu.backend.entities.PuntajesPorPregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPuntajesPorPreguntaRepository extends JpaRepository<PuntajesPorPregunta, Integer> {
}
