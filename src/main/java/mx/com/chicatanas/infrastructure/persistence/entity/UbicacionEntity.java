package mx.com.chicatanas.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UbicacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double latitud;
    private Double longitud;
    private String direccion;
    @OneToOne(mappedBy = "ubicacion", cascade = CascadeType.ALL)
    private FotoEntity fotografia;
}