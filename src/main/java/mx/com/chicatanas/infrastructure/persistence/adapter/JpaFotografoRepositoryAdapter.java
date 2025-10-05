package mx.com.chicatanas.infrastructure.persistence.adapter;

import mx.com.chicatanas.application.port.out.PuertoRepositorioFotografo;
import mx.com.chicatanas.domain.Fotografo;
import mx.com.chicatanas.infrastructure.persistence.entity.FotografoEntity;
import mx.com.chicatanas.infrastructure.persistence.repository.SpringDataFotografoRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
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
    public Optional<Fotografo> buscarFotografoPorId(Fotografo fotografo) {
        return Optional.empty();
    }
}
