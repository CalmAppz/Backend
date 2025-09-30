package pe.edu.upc.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "grado_academico")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GradoAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "grado", nullable = false, length = 50)
    private String grado;
}