package mx.com.chicatanas.application.port.in;

import mx.com.chicatanas.domain.Foto;
import mx.com.chicatanas.domain.Fotografo;
import mx.com.chicatanas.domain.Ubicacion;

public interface CasoUsoGuardarFoto {
    Foto crearFotoSinFotografo(Foto foto, Ubicacion ubicacion);
    Foto crearFoto(Foto foto, Fotografo fotografo, Ubicacion ubicacion);
}