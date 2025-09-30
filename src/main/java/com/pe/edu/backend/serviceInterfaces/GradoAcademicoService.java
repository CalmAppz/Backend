package com.pe.edu.backend.serviceInterfaces;

import com.pe.edu.backend.entities.GradoAcademico;
import java.util.List;

public interface GradoAcademicoService {
    GradoAcademico insert(GradoAcademico gradoAcademico);
    List<GradoAcademico> list();
    void delete(int id);
    void update(GradoAcademico gradoAcademico);
}
