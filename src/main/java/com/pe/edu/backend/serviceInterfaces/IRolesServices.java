package com.pe.edu.backend.serviceInterfaces;

import com.pe.edu.backend.entities.Roles;

import java.util.List;

public interface IRolesServices {
    public void insert(Roles roles);
    public List<Roles> list();
    public void delete(int id);
    public void update(Roles roles);
    public Roles listarId(int id);
}
