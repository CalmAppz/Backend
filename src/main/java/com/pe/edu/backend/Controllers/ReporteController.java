package com.pe.edu.backend.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.edu.backend.DTOS.ReporteDTO;
import com.pe.edu.backend.entities.Reporte;
import com.pe.edu.backend.serviceInterfaces.ReporteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reporte")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ReporteController {

    @Autowired
    private ReporteService reporteService;

    @PostMapping("/registro") // Crear
    public void registrar(@RequestBody ReporteDTO dto) {
        ModelMapper mapper = new ModelMapper();
        Reporte entidad = mapper.map(dto, Reporte.class);
        reporteService.insert(entidad);
    }

    @GetMapping // Listar
    public List<ReporteDTO> listar() {
        ModelMapper mapper = new ModelMapper();
        return reporteService.list()
                .stream()
                .map(e -> mapper.map(e, ReporteDTO.class))
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}") // Actualizar
    public void actualizar(@PathVariable("id") Integer id, @RequestBody ReporteDTO dto) {
        ModelMapper mapper = new ModelMapper();
        Reporte entidad = mapper.map(dto, Reporte.class);
        entidad.setId(id); // asegurar el ID de la URL
        reporteService.update(entidad);
    }

    @DeleteMapping("/{id}") // Eliminar
    public void eliminar(@PathVariable("id") Integer id) {
        reporteService.delete(id);
    }

    @GetMapping("/{id}") // Buscar por ID
    public ReporteDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper mapper = new ModelMapper();
        Reporte entidad = reporteService.listarId(id);
        return mapper.map(entidad, ReporteDTO.class);
    }
}
