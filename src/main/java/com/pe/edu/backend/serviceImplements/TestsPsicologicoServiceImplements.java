package com.pe.edu.backend.serviceImplements;

import com.pe.edu.backend.entities.TestsPsicologico;
import com.pe.edu.backend.repositories.ITestsPsicologicoRepository;
import com.pe.edu.backend.serviceInterfaces.TestsPsicologicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestsPsicologicoServiceImplements implements TestsPsicologicoService {

    @Autowired
    private ITestsPsicologicoRepository iTestsPsicologicoRepository;

    @Override
    public TestsPsicologico insert(TestsPsicologico testsPsicologico) {
        return iTestsPsicologicoRepository.save(testsPsicologico);
    }

    @Override
    public List<TestsPsicologico> list() {
        return iTestsPsicologicoRepository.findAll();
    }

    @Override
    public void delete(int id) {
        iTestsPsicologicoRepository.deleteById(id);
    }

    @Override
    public void update(TestsPsicologico testsPsicologico) {
        iTestsPsicologicoRepository.save(testsPsicologico);
    }

    @Override
    public TestsPsicologico listarId(int id) {
        return iTestsPsicologicoRepository.findById(id).orElse(new TestsPsicologico());
    }
}
