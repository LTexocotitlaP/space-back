package mx.com.chicatanas.application.port.in;

import mx.com.chicatanas.domain.Foto;
import mx.com.chicatanas.domain.Fotografo;
import mx.com.chicatanas.domain.Ubicacion;

public interface CasoUsoBuscarFoto {
    Foto buscarFotoPorUbicacion(Ubicacion ubicacion);
    Foto buscarFotoPorFotografo(Fotografo fotografo);
}