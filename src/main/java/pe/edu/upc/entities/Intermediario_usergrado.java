package pe.edu.upc.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "intermediario")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Intermediario_usergrado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "grado_id", nullable = false)
    private GradoAcademico grado;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;
}
