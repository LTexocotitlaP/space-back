package mx.com.chicatanas.application.port.out;

import mx.com.chicatanas.domain.Fotografia;
import mx.com.chicatanas.domain.Ubicacion;

import java.util.List;
import java.util.Optional;

public interface PuertoRepositorioFotografo {

    Fotografia save (Fotografia fotografo);
    Optional<List<Fotografia>> getFotografias  (Ubicacion ubicacion);

}