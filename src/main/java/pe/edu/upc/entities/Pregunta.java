package pe.edu.upc.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pregunta")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "preguntaunica", nullable = false, length = 255)
    private String preguntaUnica;
}