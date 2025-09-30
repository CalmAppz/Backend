package pe.edu.upc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tests_psicologico")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TestsPsicologico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private Users user;
}