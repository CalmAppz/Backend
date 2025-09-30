package com.pe.edu.backend.serviceInterfaces;

import com.pe.edu.backend.entities.Intermediario_usergrado;
import java.util.List;

public interface Intermediario_usergradoService {
    Intermediario_usergrado insert(Intermediario_usergrado intermediarioUsergrado);
    List<Intermediario_usergrado> list();
    void delete(int id);
    void update(Intermediario_usergrado intermediarioUsergrado);
}
