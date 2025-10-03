package com.pe.edu.backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.edu.backend.DTOS.TestsPsicologicoDTO;
import com.pe.edu.backend.entities.TestsPsicologico;
import com.pe.edu.backend.serviceInterfaces.TestsPsicologicoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tests-psicologico")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TestsPsicologicoController {

    @Autowired
    private TestsPsicologicoService testsPsicologicoService;

    @PostMapping("/registro") // Crear
    public void registrar(@RequestBody TestsPsicologicoDTO dto) {
        ModelMapper mapper = new ModelMapper();
        TestsPsicologico entidad = mapper.map(dto, TestsPsicologico.class);
        testsPsicologicoService.insert(entidad);
    }

    @GetMapping // Listar
    public List<TestsPsicologicoDTO> listar() {
        ModelMapper mapper = new ModelMapper();
        return testsPsicologicoService.list()
                .stream()
                .map(e -> mapper.map(e, TestsPsicologicoDTO.class))
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}") // Actualizar
    public void actualizar(@PathVariable("id") Integer id, @RequestBody TestsPsicologicoDTO dto) {
        ModelMapper mapper = new ModelMapper();
        TestsPsicologico entidad = mapper.map(dto, TestsPsicologico.class);
        entidad.setId(id); // asegurar que coincida con la URL
        testsPsicologicoService.update(entidad);
    }

    @DeleteMapping("/{id}") // Eliminar
    public void eliminar(@PathVariable("id") Integer id) {
        testsPsicologicoService.delete(id);
    }

    @GetMapping("/{id}") // Buscar por ID
    public TestsPsicologicoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper mapper = new ModelMapper();
        TestsPsicologico entidad = testsPsicologicoService.listarId(id);
        return mapper.map(entidad, TestsPsicologicoDTO.class);
    }
}
