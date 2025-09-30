package com.pe.edu.backend.repositories;

import com.pe.edu.backend.entities.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReporteRepository extends JpaRepository<Reporte, Integer> {
}
