package com.pe.edu.backend.serviceInterfaces;

import com.pe.edu.backend.entities.Users;

import java.util.List;

public interface IUserServices {
    Users insert(Users user);
    public List<Users> list();
    public void delete(int id);
    public void update(Users user);
    public Users listarId(int id);
    public Users finduser(String username);
}
