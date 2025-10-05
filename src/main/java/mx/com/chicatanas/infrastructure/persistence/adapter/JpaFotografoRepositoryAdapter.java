package mx.com.chicatanas.infrastructure.persistence.adapter;

import mx.com.chicatanas.application.port.out.PuertoRepositorioFotografo;
import mx.com.chicatanas.domain.Fotografia;
import mx.com.chicatanas.domain.Ubicacion;

import java.util.List;
import java.util.Optional;

public class JpaFotografoRepositoryAdapter implements PuertoRepositorioFotografo {

    private final JpaFotografoRepositoryAdapter jpaFotografoRepositoryAdapter;

    public JpaFotografoRepositoryAdapter(JpaFotografoRepositoryAdapter jpaFotografoRepositoryAdapter) {
        this.jpaFotografoRepositoryAdapter = jpaFotografoRepositoryAdapter;
    }

    @Override
    public Fotografia save(Fotografia fotografo) {
        return null;
    }

    @Override
    public Optional<List<Fotografia>> getFotografias(Ubicacion ubicacion) {
        return Optional.empty();
    }
}
