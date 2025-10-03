package com.pe.edu.backend.DTOS;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pe.edu.backend.entities.Roles;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UsersDTO {
    private Long id;
    private String username;
    private String password;
    private String nombresapellidos;
    private String correo;
    private String colegio;
    private String foto;
    private String grado;
    private Boolean enabled;
    private List<Roles> roles = new ArrayList<>();

}
