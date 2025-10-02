package com.pe.edu.backend.serviceImplements;

import com.pe.edu.backend.entities.GradoAcademico;
import com.pe.edu.backend.entities.TestsPsicologico;
import com.pe.edu.backend.repositories.IGradoAcademicoRepository;
import com.pe.edu.backend.serviceInterfaces.GradoAcademicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradoAcademicoServiceImplements implements GradoAcademicoService {

    @Autowired
    private IGradoAcademicoRepository gradoAcademicoRepository;

    @Override
    public GradoAcademico insert(GradoAcademico gradoAcademico) {
        return gradoAcademicoRepository.save(gradoAcademico);
    }

    @Override
    public List<GradoAcademico> list() {
        return gradoAcademicoRepository.findAll();
    }

    @Override
    public void delete(int id) {
        gradoAcademicoRepository.deleteById(id);
    }

    @Override
    public void update(GradoAcademico gradoAcademico) {
        gradoAcademicoRepository.save(gradoAcademico);
    }

    @Override
    public GradoAcademico listarId(int id) {
        return gradoAcademicoRepository.findById(id).orElse(new GradoAcademico());
    }
}
