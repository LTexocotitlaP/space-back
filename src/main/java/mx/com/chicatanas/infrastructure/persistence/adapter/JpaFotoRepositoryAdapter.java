package mx.com.chicatanas.infrastructure.persistence.adapter;

import mx.com.chicatanas.application.port.out.PuertoRepositorioFoto;
import mx.com.chicatanas.domain.Foto;
import mx.com.chicatanas.domain.Ubicacion;
import mx.com.chicatanas.infrastructure.persistence.entity.FotoEntity;
import mx.com.chicatanas.infrastructure.persistence.entity.UbicacionEntity;
import mx.com.chicatanas.infrastructure.persistence.repository.SpringDataFotoRepository;
import org.springframework.stereotype.Repository;

@Repository
public class JpaFotoRepositoryAdapter implements PuertoRepositorioFoto {

    private final SpringDataFotoRepository springDataFotoRepository;

    public JpaFotoRepositoryAdapter(SpringDataFotoRepository springDataFotoRepository) {
        this.springDataFotoRepository = springDataFotoRepository;
    }

    @Override
    public Foto save(Foto foto) {
        UbicacionEntity ubicacionEntity = new UbicacionEntity(
                foto.getUbicacion().getLatitud(),
                foto.getUbicacion().getLongitud()
        );
        FotoEntity fotoEntity = new FotoEntity(foto.getImagen(), ubicacionEntity);
        FotoEntity saved = springDataFotoRepository.save(fotoEntity);
        Ubicacion ubicacion = new Ubicacion(saved.getUbicacion().getLatitud(), saved.getUbicacion().getLongitud());
        return new Foto(saved.getId(), saved.getImagen(), ubicacion);
    }

    @Override
    public Foto getByUbicacion(Ubicacion ubicacion) { return null; }

    @Override
    public Foto getByFotografo(mx.com.chicatanas.domain.Fotografo fotografo) { return null; }

    @Override
    public void delete(mx.com.chicatanas.domain.Fotografo fotografo, Foto foto) { }

    @Override
    public Foto subirFoto(Foto foto) { return save(foto); }
}
