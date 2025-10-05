package mx.com.chicatanas.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UbicacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double latitud;

    @Column(nullable = false)
    private Double longitud;

    @OneToOne(mappedBy = "ubicacion", cascade = CascadeType.ALL, orphanRemoval = true)
    private FotoEntity fotografia;

    public UbicacionEntity(Double latitud, Double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }
}