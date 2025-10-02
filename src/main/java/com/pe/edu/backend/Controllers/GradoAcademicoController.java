package com.pe.edu.backend.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.edu.backend.DTOS.GradoAcademicoDTO;
import com.pe.edu.backend.entities.GradoAcademico;
import com.pe.edu.backend.serviceInterfaces.GradoAcademicoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/grado-academico")
@CrossOrigin(origins = {"http://localhost:4200"})
public class GradoAcademicoController {

    @Autowired
    private GradoAcademicoService gradoService;

    @PostMapping("/registro") // Crear
    public void registrar(@RequestBody GradoAcademicoDTO dto) {
        ModelMapper mapper = new ModelMapper();
        GradoAcademico entidad = mapper.map(dto, GradoAcademico.class);
        gradoService.insert(entidad);
    }

    @GetMapping // Listar
    public List<GradoAcademicoDTO> listar() {
        return gradoService.list().stream().map(e -> {
            ModelMapper mapper = new ModelMapper();
            return mapper.map(e, GradoAcademicoDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping("/{id}") // Actualizar
    public void actualizar(@PathVariable("id") Integer id, @RequestBody GradoAcademicoDTO dto) {
        ModelMapper mapper = new ModelMapper();
        GradoAcademico entidad = mapper.map(dto, GradoAcademico.class);
        entidad.setId(id); // asegurar el ID de la URL
        gradoService.update(entidad);
    }

    @DeleteMapping("/{id}") // Eliminar
    public void eliminar(@PathVariable("id") Integer id) {
        gradoService.delete(id);
    }

    @GetMapping("/{id}") // Buscar por ID
    public GradoAcademicoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper mapper = new ModelMapper();
        GradoAcademico entidad = gradoService.listarId(id);
        return mapper.map(entidad, GradoAcademicoDTO.class);
    }
}
