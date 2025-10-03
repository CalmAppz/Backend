package com.pe.edu.backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.edu.backend.DTOS.RolesDTO;
import com.pe.edu.backend.entities.Roles;
import com.pe.edu.backend.serviceInterfaces.IRolesServices;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RolesController {

    @Autowired
    private IRolesServices rolesService;

    @PostMapping("/registro") // Crear
    public void registrar(@RequestBody RolesDTO dto) {
        ModelMapper mapper = new ModelMapper();
        Roles entidad = mapper.map(dto, Roles.class);
        rolesService.insert(entidad);
    }

    @GetMapping // Listar
    public List<RolesDTO> listar() {
        ModelMapper mapper = new ModelMapper();
        return rolesService.list()
                .stream()
                .map(e -> mapper.map(e, RolesDTO.class))
                .collect(Collectors.toList());
    }

    @PutMapping("/{id}") // Actualizar
    public void actualizar(@PathVariable("id") Long id, @RequestBody RolesDTO dto) {
        ModelMapper mapper = new ModelMapper();
        Roles entidad = mapper.map(dto, Roles.class);
        entidad.setId(id); // asegurar que el ID coincida con el de la URL
        rolesService.update(entidad);
    }

    @DeleteMapping("/{id}") // Eliminar
    public void eliminar(@PathVariable("id") Long id) {
        rolesService.delete(id.intValue()); // service usa int
    }

    @GetMapping("/{id}") // Buscar por ID
    public RolesDTO listarId(@PathVariable("id") Long id) {
        ModelMapper mapper = new ModelMapper();
        Roles entidad = rolesService.listarId(id.intValue()); // service usa int
        return mapper.map(entidad, RolesDTO.class);
    }
}
