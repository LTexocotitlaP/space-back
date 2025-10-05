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
    private byte[] imagen;
    private String descripcion;
    @ManyToOne(optional = true)
    @JoinColumn(name = "fotografo_id", nullable = true)
    private FotografoEntity fotografo;
    @OneToOne
    @JoinColumn(name = "ubicacion_id", unique = true)
    private UbicacionEntity ubicacion;

    public FotoEntity(byte[] imagen, String descripcion, FotografoEntity fotografo, UbicacionEntity ubicacion) {
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.fotografo = fotografo;
        this.ubicacion = ubicacion;
    }
}