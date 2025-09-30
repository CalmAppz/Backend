package pe.edu.upc.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "puntajes_por_pregunta")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PuntajesPorPregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "tests_psicologico_id", nullable = false)
    private TestsPsicologico testsPsicologico;

    @ManyToOne
    @JoinColumn(name = "pregunta_id", nullable = false)
    private Pregunta pregunta;

    @Column(name = "puntaje", nullable = false)
    private int puntaje;
}
