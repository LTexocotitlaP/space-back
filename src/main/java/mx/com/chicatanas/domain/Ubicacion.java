package mx.com.chicatanas.domain;

public class Ubicacion {

    private Long id;
    private Double latitud;
    private Double longitud;
    private String direccion;
    private Foto fotografia;

    public Ubicacion() {}

    public Ubicacion(Double latitud, Double longitud, String direccion, Foto fotografia) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.direccion = direccion;
        this.fotografia = fotografia;
    }

    public Long getId() {
        return id;
    }

    public Double getLatitud() {
        return latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public String getDireccion() {
        return direccion;
    }

    public Foto getFotografia() {
        return fotografia;
    }
}