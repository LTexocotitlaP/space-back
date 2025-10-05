package mx.com.chicatanas.application.port.in;

import mx.com.chicatanas.domain.Fotografo;

import java.util.Optional;

public interface CasoUsoBuscarFotografo {
    Optional<Fotografo> buscarFotografo(Long id);
}