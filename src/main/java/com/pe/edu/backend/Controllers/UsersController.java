package com.pe.edu.backend.Controllers;

import com.pe.edu.backend.DTOS.UsersDTO;
import com.pe.edu.backend.entities.Users;
import com.pe.edu.backend.serviceInterfaces.IUserServices;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/User")
@CrossOrigin(origins = {"http://localhost:4200" /*tambien puedes añadr mas*/ }, allowedHeaders = "*", allowCredentials = "true")
public class UsersController {
    @Autowired
    private IUserServices uS;





    @GetMapping //listar
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<UsersDTO> list(){
        return uS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, UsersDTO.class); //expresion lambda para la transformacion
        }).collect(Collectors.toList()); //lista de tipo Shoe
    }

    @PutMapping("/{id}") // actualizar
    public void actualizar(@PathVariable("id") Long id, @RequestBody UsersDTO u){
        ModelMapper m = new ModelMapper();
        Users uh = m.map(u, Users.class);
        uh.setId(id); // asegurarse de que el objeto tenga el mismo ID que el proporcionado en la URL
        uS.update(uh);
    }

    @DeleteMapping("/{id}") //reconozca parametros que estamos pasando
    public void eliminar(@PathVariable("id") int id){
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public UsersDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        UsersDTO dto = m.map(uS.listarId(id), UsersDTO.class);
        return dto;
    }

    @GetMapping("/nombreusuario")
    public UsersDTO encontraruser(@RequestParam String nombreuser){
        ModelMapper m = new ModelMapper();
        UsersDTO dto = m.map(uS.finduser(nombreuser), UsersDTO.class);
        return dto;
    }

}