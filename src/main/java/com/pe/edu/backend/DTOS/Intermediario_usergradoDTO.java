package com.pe.edu.backend.DTOS;

import com.pe.edu.backend.entities.GradoAcademico;
import com.pe.edu.backend.entities.Users;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Intermediario_usergradoDTO {
    private int id;
    private GradoAcademico grado;
    private Users users;
}
