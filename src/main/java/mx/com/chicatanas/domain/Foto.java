package mx.com.chicatanas.domain;

import java.awt.*;

public class Foto {

    private Long id;
    private Image imagen;
    private String descripcion;
    private Fotografo fotografo;
    private Ubicacion ubicacion;

    public Foto() {}

    public Foto(Long id) {
        this.id = id;
    }

    public Foto(Long id, Image imagen) {
        this.id = id;
        this.imagen = imagen;
    }

    public Foto(Long id, Image imagen, String descripcion) {
        this.id = id;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    public Foto(Long id, Image imagen, String descripcion, Fotografo fotografo) {
        this.id = id;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.fotografo = fotografo;
    }

    public Foto(Long id, Image imagen, String descripcion, Fotografo fotografo, Ubicacion ubicacion) {
        this.id = id;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.fotografo = fotografo;
        this.ubicacion = ubicacion;
    }

    public Long getId() {
        return id;
    }

    public Image getImagen() {
        return imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Fotografo getFotografo() {
        return fotografo;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
