package mx.com.chicatanas.infrastructure.persistence.adapter;

import mx.com.chicatanas.application.port.out.PuertoRepositorioFotografo;
import mx.com.chicatanas.domain.Fotografo;
import mx.com.chicatanas.infrastructure.persistence.entity.FotografoEntity;
import mx.com.chicatanas.infrastructure.persistence.repository.SpringDataFotografoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaFotografoRepositoryAdapter implements PuertoRepositorioFotografo {

    private final SpringDataFotografoRepository springDataFotografoRepository;

    public JpaFotografoRepositoryAdapter(SpringDataFotografoRepository springDataFotografoRepository) {
        this.springDataFotografoRepository = springDataFotografoRepository;
    }

    @Override
    public Fotografo save(Fotografo fotografo) {
        FotografoEntity fotografoEntity = new FotografoEntity(fotografo.getNombre(), fotografo.getApellido(), fotografo.getEmail());
        FotografoEntity savedFotografo = springDataFotografoRepository.save(fotografoEntity);
        return new Fotografo(savedFotografo.getId(), savedFotografo.getNombre(), savedFotografo.getApellido(), savedFotografo.getEmail());
    }

    @Override
    public Optional<Fotografo> buscarFotografoPorId(Long id) {
        final FotografoEntity fotografoEntity = springDataFotografoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Fotografo no encontrado"));
        return Optional.of(new Fotografo(fotografoEntity.getId(), fotografoEntity.getNombre(), fotografoEntity.getEmail()));
    }
}