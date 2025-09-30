package com.pe.edu.backend.serviceImplements;

import com.pe.edu.backend.entities.Roles;
import com.pe.edu.backend.repositories.IRolesRepository;
import com.pe.edu.backend.serviceInterfaces.IRolesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServicesImplements implements IRolesServices {

    @Autowired
    private IRolesRepository rR;

    @Override
    public void insert(Roles roles) {
        rR.save(roles);
    }

    @Override
    public List<Roles> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public void update(Roles roles) {
        rR.save(roles);
    }

    @Override
    public Roles listarId(int id) {
        return rR.findById(id).orElse(new Roles());
    }
}
