package com.pe.edu.backend.repositories;

import com.pe.edu.backend.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersRepository extends JpaRepository<Users, Integer> {

    public Users findByUsername(String nameUser);
}
