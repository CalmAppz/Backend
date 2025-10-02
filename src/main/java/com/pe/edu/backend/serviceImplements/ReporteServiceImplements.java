package com.pe.edu.backend.serviceImplements;

import com.pe.edu.backend.entities.Reporte;
import com.pe.edu.backend.entities.TestsPsicologico;
import com.pe.edu.backend.repositories.IReporteRepository;
import com.pe.edu.backend.serviceInterfaces.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteServiceImplements implements ReporteService {

    @Autowired
    private IReporteRepository reporteRepository;

    @Override
    public Reporte insert(Reporte reporte) {
        return reporteRepository.save(reporte);
    }

    @Override
    public List<Reporte> list() {
        return reporteRepository.findAll();
    }

    @Override
    public void delete(int id) {
        reporteRepository.deleteById(id);
    }

    @Override
    public void update(Reporte reporte) {
        reporteRepository.save(reporte);
    }

    @Override
    public Reporte listarId(int id) {
        return reporteRepository.findById(id).orElse(new Reporte());
    }
}
