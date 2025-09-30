package com.pe.edu.backend.repositories;

import com.pe.edu.backend.entities.TestsPsicologico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestsPsicologicoRepository extends JpaRepository<TestsPsicologico, Integer> {
}
