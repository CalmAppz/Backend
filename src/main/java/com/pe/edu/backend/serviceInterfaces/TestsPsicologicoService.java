package com.pe.edu.backend.serviceInterfaces;

import com.pe.edu.backend.entities.TestsPsicologico;
import org.aspectj.weaver.ast.Test;

import java.util.List;

public interface TestsPsicologicoService {
    TestsPsicologico insert(TestsPsicologico testsPsicologico);
    List<TestsPsicologico> list();
    void delete(int id);
    void update(TestsPsicologico testsPsicologico);
    public TestsPsicologico listarId(int id);
}
