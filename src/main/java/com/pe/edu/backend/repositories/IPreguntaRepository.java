package com.pe.edu.backend.repositories;

import com.pe.edu.backend.entities.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPreguntaRepository extends JpaRepository<Pregunta, Integer> {
}
