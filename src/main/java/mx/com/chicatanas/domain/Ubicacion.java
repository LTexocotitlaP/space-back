package mx.com.chicatanas.domain;

public class Ubicacion {

    private Long id;
    private Double latitud;
    private Double longitud;
    private Foto fotografia;

    public Ubicacion() {}

    public Ubicacion(Double latitud, Double longitud, Foto fotografia) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.fotografia = fotografia;
    }

    public Ubicacion(Double latitud, Double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
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

    public Foto getFotografia() {
        return fotografia;
    }
}