package mx.com.chicatanas.domain;

import java.util.List;

public class Fotografo {

    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private List<Foto> fotografias;

    public Fotografo() {}

    public Fotografo(Long id) {
        this.id = id;
    }

    public Fotografo(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Fotografo(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Fotografo(Long id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Fotografo(Long id, String nombre, String apellido, String email, List<Foto> fotografias) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fotografias = fotografias;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public List<Foto> getFotografias() {
        return fotografias;
    }

    @Override
    public String toString() {
        return "Fotografo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", fotografias=" + fotografias +
                '}';
    }
}