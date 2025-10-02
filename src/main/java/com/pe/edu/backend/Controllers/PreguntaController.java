package com.pe.edu.backend.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.edu.backend.DTOS.PreguntaDTO;
import com.pe.edu.backend.entities.Pregunta;
import com.pe.edu.backend.serviceInterfaces.PreguntaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pregunta")
@CrossOrigin(origins = {"http://localhost:4200"})
public class PreguntaController {

    @Autowired
    private PreguntaService preguntaService;

    @PostMapping("/registro") // Crear
    public void registrar(@RequestBody PreguntaDTO dto) {
        ModelMapper mapper = new ModelMapper();
        Pregunta entidad = mapper.map(dto, Pregunta.class);
        preguntaService.insert(entidad);
    }

    @GetMapping // Listar
    public List<PreguntaDTO> listar() {
        ModelMapper mapper = new ModelMapper();
        return preguntaService.list()
                .stream()
                .map(e -> mapper.map(e, PreguntaDTO.class))
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}") // Actualizar
    public void actualizar(@PathVariable("id") Integer id, @RequestBody PreguntaDTO dto) {
        ModelMapper mapper = new ModelMapper();
        Pregunta entidad = mapper.map(dto, Pregunta.class);
        entidad.setId(id); // asegurar que coincida con la URL
        preguntaService.update(entidad);
    }

    @DeleteMapping("/{id}") // Eliminar
    public void eliminar(@PathVariable("id") Integer id) {
        preguntaService.delete(id);
    }

    @GetMapping("/{id}") // Buscar por ID
    public PreguntaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper mapper = new ModelMapper();
        Pregunta entidad = preguntaService.listarId(id);
        return mapper.map(entidad, PreguntaDTO.class);
    }
}
