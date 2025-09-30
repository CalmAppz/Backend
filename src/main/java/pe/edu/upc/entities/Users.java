package pe.edu.upc.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "UserTable")
@Getter
@Setter
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, unique = true)
    private String username;
    @Column(length = 200)
    private String password;
    private String nombresapellidos;
    @Column(length = 100)
    private String correo;
    @Column(length = 200)
    private String colegio;
    @Column(length = 200)
    private String foto;
    private String grado;
    @Column(length = 100)
    private Boolean enabled;

    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Roles> roles = new ArrayList<>();

}
