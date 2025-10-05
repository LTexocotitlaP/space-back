package mx.com.chicatanas.domain;

public class Foto {

    private Long id;
    private byte[] imagen;
    private String descripcion;
    private Fotografo fotografo;
    private Ubicacion ubicacion;

    public Foto(Long id, byte[] imagen, Ubicacion ubicacion) {
        this.id = id;
        this.imagen = imagen;
        this.ubicacion = ubicacion;
    }

    public Foto(byte[] imagen, Ubicacion ubicacion) {
        this.imagen = imagen;
        this.ubicacion = ubicacion;
    }

    public Long getId() {
        return id;
    }

    public byte[] getImagen() {
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
