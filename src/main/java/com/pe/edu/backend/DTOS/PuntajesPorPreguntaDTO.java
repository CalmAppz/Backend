package com.pe.edu.backend.DTOS;
import com.pe.edu.backend.entities.Pregunta;
import com.pe.edu.backend.entities.TestsPsicologico;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PuntajesPorPreguntaDTO {
    private int id;
    private TestsPsicologico testsPsicologico;
    private Pregunta pregunta;
    private int puntaje;
}
