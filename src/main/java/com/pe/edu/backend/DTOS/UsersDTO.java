package com.pe.edu.backend.DTOS;

import com.pe.edu.backend.entities.Roles;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UsersDTO {
    private Long id;

    private String username;
    private String password;
    private Boolean enabled;
    private List<Roles> roles;

}
