package com.pe.edu.backend.repositories;

import com.pe.edu.backend.entities.GradoAcademico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGradoAcademicoRepository extends JpaRepository<GradoAcademico, Integer> {
}
