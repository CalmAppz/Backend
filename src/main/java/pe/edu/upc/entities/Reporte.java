package pe.edu.upc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "reporte")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre_reporte", nullable = false, length = 255)
    private String nombreReporte;

    @Column(name = "resultado", nullable = false, length = 255)
    private String resultado;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "tests_psicologico_id", nullable = false)
    private TestsPsicologico testsPsicologico;

    @Column(name = "recomendacion", nullable = true, length = 255)
    private String recomendacion;
}