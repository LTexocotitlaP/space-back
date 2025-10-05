package mx.com.chicatanas.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FotografiaEntity {
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
}
