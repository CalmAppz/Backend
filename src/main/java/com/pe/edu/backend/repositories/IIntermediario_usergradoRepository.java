package com.pe.edu.backend.repositories;

import com.pe.edu.backend.entities.Intermediario_usergrado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIntermediario_usergradoRepository extends JpaRepository<Intermediario_usergrado, Integer> {
}
