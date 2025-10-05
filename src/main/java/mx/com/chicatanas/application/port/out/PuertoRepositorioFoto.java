package mx.com.chicatanas.application.port.out;

import mx.com.chicatanas.domain.Foto;
import mx.com.chicatanas.domain.Fotografo;
import mx.com.chicatanas.domain.Ubicacion;

public interface PuertoRepositorioFoto {

    Foto getByUbicacion(Ubicacion ubicacion);
    Foto getByFotografo(Fotografo fotografo);
    void delete(Fotografo fotografo, Foto foto);
    Foto subirFoto(Foto foto);
    Foto save(Foto foto);

}