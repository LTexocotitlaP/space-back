package mx.com.chicatanas.application.port.in;

import mx.com.chicatanas.domain.Foto;
import mx.com.chicatanas.domain.Fotografo;

public interface CasoUsoEliminarFoto {
    void eliminarFoto(Fotografo fotografo, Foto foto);
}