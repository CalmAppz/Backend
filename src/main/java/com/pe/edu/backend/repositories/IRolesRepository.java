package com.pe.edu.backend.repositories;

import com.pe.edu.backend.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRolesRepository extends JpaRepository<Roles, Integer> {
    List<Roles> findByUserId(int userId);
}
