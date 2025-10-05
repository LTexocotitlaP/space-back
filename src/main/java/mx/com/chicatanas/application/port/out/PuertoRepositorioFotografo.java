package mx.com.chicatanas.application.port.out;

import mx.com.chicatanas.domain.Foto;
import mx.com.chicatanas.domain.Fotografo;
import mx.com.chicatanas.domain.Ubicacion;

import java.util.List;
import java.util.Optional;

public interface PuertoRepositorioFotografo {

    Foto save (Foto fotografo);
    Optional<List<Foto>> getFotografias  (Ubicacion ubicacion);
    Optional<List<Foto>> buscarFotografiasPorFotografo (Fotografo fotografo);
    void eliminarFotografia (Foto foto);

}