package mx.com.chicatanas.application.service;

import mx.com.chicatanas.application.port.in.CasoUsoBuscarFoto;
import mx.com.chicatanas.application.port.in.CasoUsoEliminarFoto;
import mx.com.chicatanas.application.port.in.CasoUsoGuardarFoto;
import mx.com.chicatanas.application.port.out.PuertoRepositorioFoto;
import mx.com.chicatanas.domain.Foto;
import mx.com.chicatanas.domain.Fotografo;
import mx.com.chicatanas.domain.Ubicacion;
import org.springframework.stereotype.Service;

@Service
public class FotoService implements
        CasoUsoGuardarFoto,
        CasoUsoBuscarFoto,
        CasoUsoEliminarFoto
{

    private final PuertoRepositorioFoto puertoRepositorioFoto;

    public FotoService(PuertoRepositorioFoto puertoRepositorioFoto) {
        this.puertoRepositorioFoto = puertoRepositorioFoto;
    }

    @Override
    public Foto buscarFotoPorUbicacion(Ubicacion ubicacion) {
        return null;
    }

    @Override
    public Foto buscarFotoPorFotografo(Fotografo fotografo) {
        return null;
    }

    @Override
    public void eliminarFoto(Fotografo fotografo, Foto foto) {

    }

    @Override
    public Foto crearFotoSinFotografo(Foto foto, Ubicacion ubicacion) {
        return null;
    }

    @Override
    public Foto crearFoto(Foto foto, Fotografo fotografo, Ubicacion ubicacion) {
        return null;
    }
}