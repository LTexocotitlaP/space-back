package mx.com.chicatanas.infrastructure.persistence.adapter;

import mx.com.chicatanas.application.port.out.PuertoRepositorioFoto;
import mx.com.chicatanas.domain.Foto;
import mx.com.chicatanas.domain.Fotografo;
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
    public Foto getByUbicacion(Ubicacion ubicacion) {
        return null;
    }

    @Override
    public Foto getByFotografo(Fotografo fotografo) {
        return null;
    }

    @Override
    public void delete(Fotografo fotografo, Foto foto) {

    }

    @Override
    public Foto subirFoto(Foto foto) {
        return null;
    }

    @Override
    public Foto save(Foto foto) {
        FotoEntity fotoEntity = new FotoEntity(foto.getImagen(), new UbicacionEntity(foto.getUbicacion().getLatitud(), foto.getUbicacion().getLongitud()));
        FotoEntity savedFoto = springDataFotoRepository.save(fotoEntity);
        return new Foto(savedFoto.getId(), savedFoto.getImagen(), new Ubicacion(savedFoto.getUbicacion().getLatitud(), savedFoto.getUbicacion().getLongitud()));
    }
}