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

    // Quitamos mappedBy, FotoEntity será el dueño
    @OneToOne(mappedBy = "ubicacion")
    private FotoEntity fotografia;

    public UbicacionEntity(Double latitud, Double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }
}
