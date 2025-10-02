package com.pe.edu.backend.DTOS;
import com.pe.edu.backend.entities.TestsPsicologico;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ReporteDTO {
    private int id;
    private String nombreReporte;
    private String resultado;
    private LocalDate fechaCreacion;
    private TestsPsicologico testsPsicologico;
    private String recomendacion;
}
