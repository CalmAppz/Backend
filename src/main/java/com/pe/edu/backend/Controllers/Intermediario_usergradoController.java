package com.pe.edu.backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.edu.backend.DTOS.Intermediario_usergradoDTO;
import com.pe.edu.backend.entities.Intermediario_usergrado;
import com.pe.edu.backend.serviceInterfaces.Intermediario_usergradoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/intermediario-usergrado")
@CrossOrigin(origins = {"http://localhost:4200"})
public class Intermediario_usergradoController {

    @Autowired
    private Intermediario_usergradoService intermediarioUsergradoService;

    @PostMapping("/registro") // Crear
    public void registrar(@RequestBody Intermediario_usergradoDTO dto) {
        ModelMapper mapper = new ModelMapper();
        Intermediario_usergrado entidad = mapper.map(dto, Intermediario_usergrado.class);
        intermediarioUsergradoService.insert(entidad);
    }

    @GetMapping // Listar
    public List<Intermediario_usergradoDTO> listar() {
        ModelMapper mapper = new ModelMapper();
        return intermediarioUsergradoService.list()
                .stream()
                .map(e -> mapper.map(e, Intermediario_usergradoDTO.class))
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}") // Actualizar
    public void actualizar(@PathVariable("id") Integer id, @RequestBody Intermediario_usergradoDTO dto) {
        ModelMapper mapper = new ModelMapper();
        Intermediario_usergrado entidad = mapper.map(dto, Intermediario_usergrado.class);
        entidad.setId(id); // asegurar el ID de la URL
        intermediarioUsergradoService.update(entidad);
    }

    @DeleteMapping("/{id}") // Eliminar
    public void eliminar(@PathVariable("id") Integer id) {
        intermediarioUsergradoService.delete(id);
    }

    @GetMapping("/{id}") // Buscar por ID
    public Intermediario_usergradoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper mapper = new ModelMapper();
        Intermediario_usergrado entidad = intermediarioUsergradoService.listarId(id);
        return mapper.map(entidad, Intermediario_usergradoDTO.class);
    }
}
