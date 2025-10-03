package com.pe.edu.backend.serviceImplements;
import com.pe.edu.backend.entities.Intermediario_usergrado;
import com.pe.edu.backend.repositories.IIntermediario_usergradoRepository;
import com.pe.edu.backend.serviceInterfaces.Intermediario_usergradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Intermediario_usergradoServiceImplements implements Intermediario_usergradoService {

    @Autowired
    private IIntermediario_usergradoRepository intermediario_usergradoRepository;

    @Override
    public Intermediario_usergrado insert(Intermediario_usergrado intermediarioUsergrado) {
        return intermediario_usergradoRepository.save(intermediarioUsergrado);
    }

    @Override
    public List<Intermediario_usergrado> list() {
        return intermediario_usergradoRepository.findAll();
    }

    @Override
    public void delete(int id) {
        intermediario_usergradoRepository.deleteById(id);
    }

    @Override
    public void update(Intermediario_usergrado intermediarioUsergrado) {
        intermediario_usergradoRepository.save(intermediarioUsergrado);
    }

    @Override
    public Intermediario_usergrado listarId(int id) {
        return intermediario_usergradoRepository.findById(id).orElse(new Intermediario_usergrado());
    }
}
