package mx.com.chicatanas.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FotoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Lob
    @Column(nullable = false)
    private byte[] imagen;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "fotografo_id")
    private FotografoEntity fotografo;

    @OneToOne(optional = false, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ubicacion_id", nullable = false) // ahora no puede ser null
    private UbicacionEntity ubicacion;

    public FotoEntity(byte[] imagen, UbicacionEntity ubicacion) {
        this.imagen = imagen;
        this.ubicacion = ubicacion;
    }
}
