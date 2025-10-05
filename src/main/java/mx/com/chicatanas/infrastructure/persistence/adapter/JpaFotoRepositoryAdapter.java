package mx.com.chicatanas.infrastructure.persistence.adapter;

import mx.com.chicatanas.application.port.out.PuertoRepositorioFoto;
import mx.com.chicatanas.domain.Foto;
import mx.com.chicatanas.domain.Fotografo;
import mx.com.chicatanas.domain.Ubicacion;
import mx.com.chicatanas.infrastructure.persistence.repository.SpringDataFotoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaFotoRepositoryAdapter implements PuertoRepositorioFoto {

    private final SpringDataFotoRepository springDataFotoRepository;

    public JpaFotoRepositoryAdapter(SpringDataFotoRepository springDataFotoRepository) {
        this.springDataFotoRepository = springDataFotoRepository;
    }

    @Override
    public Foto save(Foto fotografo) {
        return null;
    }

    @Override
    public Optional<List<Foto>> getFotografias(Ubicacion ubicacion) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Foto>> buscarFotografiasPorFotografo(Fotografo fotografo) {
        return Optional.empty();
    }

    @Override
    public void eliminarFotografia(Foto foto) {

    }
}