package com.pe.edu.backend.DTOS;

import com.pe.edu.backend.entities.Users;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RolesDTO {
    private Long id;

    private String rol;

    private Users user;
}