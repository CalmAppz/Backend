package com.pe.edu.backend.serviceInterfaces;

import com.pe.edu.backend.entities.TestsPsicologico;
import java.util.List;

public interface TestsPsicologicoService {
    TestsPsicologico insert(TestsPsicologico testsPsicologico);
    List<TestsPsicologico> list();
    void delete(int id);
    void update(TestsPsicologico testsPsicologico);
}
