package mx.com.chicatanas.application.port.out;

import mx.com.chicatanas.domain.Fotografo;
import java.util.Optional;

public interface PuertoRepositorioFotografo {
    Fotografo save (Fotografo fotografo);
    Optional<Fotografo> buscarFotografoPorId (Fotografo fotografo);
}