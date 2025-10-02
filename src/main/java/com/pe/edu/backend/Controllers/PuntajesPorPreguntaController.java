package com.pe.edu.backend.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.edu.backend.DTOS.PuntajesPorPreguntaDTO;
import com.pe.edu.backend.entities.PuntajesPorPregunta;
import com.pe.edu.backend.serviceInterfaces.PuntajePorPreguntaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/puntajes-por-pregunta")
@CrossOrigin(origins = {"http://localhost:4200"})
public class PuntajesPorPreguntaController {

    @Autowired
    private PuntajePorPreguntaService puntajePorPreguntaService;

    @PostMapping("/registro") // Crear
    public void registrar(@RequestBody PuntajesPorPreguntaDTO dto) {
        ModelMapper mapper = new ModelMapper();
        PuntajesPorPregunta entidad = mapper.map(dto, PuntajesPorPregunta.class);
        puntajePorPreguntaService.insert(entidad);
    }

    @GetMapping // Listar
    public List<PuntajesPorPreguntaDTO> listar() {
        ModelMapper mapper = new ModelMapper();
        return puntajePorPreguntaService.list()
                .stream()
                .map(e -> mapper.map(e, PuntajesPorPreguntaDTO.class))
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}") // Actualizar
    public void actualizar(@PathVariable("id") Integer id, @RequestBody PuntajesPorPreguntaDTO dto) {
        ModelMapper mapper = new ModelMapper();
        PuntajesPorPregunta entidad = mapper.map(dto, PuntajesPorPregunta.class);
        entidad.setId(id); // asegurar el ID de la URL
        puntajePorPreguntaService.update(entidad);
    }

    @DeleteMapping("/{id}") // Eliminar
    public void eliminar(@PathVariable("id") Integer id) {
        puntajePorPreguntaService.delete(id);
    }

    @GetMapping("/{id}") // Buscar por ID
    public PuntajesPorPreguntaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper mapper = new ModelMapper();
        PuntajesPorPregunta entidad = puntajePorPreguntaService.listarId(id);
        return mapper.map(entidad, PuntajesPorPreguntaDTO.class);
    }
}
