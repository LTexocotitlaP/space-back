package mx.com.chicatanas.application.service;

import mx.com.chicatanas.application.port.in.CasoUsoBuscarFotografo;
import mx.com.chicatanas.application.port.in.CasoUsoCrearFotografo;
import mx.com.chicatanas.application.port.out.PuertoRepositorioFotografo;
import mx.com.chicatanas.domain.Fotografo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FotografoService implements
        CasoUsoCrearFotografo,
        CasoUsoBuscarFotografo
{

    private final PuertoRepositorioFotografo puertoRepositorioFotografo;

    public FotografoService(PuertoRepositorioFotografo puertoRepositorioFotografo) {
        this.puertoRepositorioFotografo = puertoRepositorioFotografo;
    }

    @Override
    public Optional<Fotografo> buscarFotografo(Long id) {
        return puertoRepositorioFotografo.buscarFotografoPorId(id);
    }

    @Override
    public Fotografo crearFotografo(Fotografo fotografo) {
        return puertoRepositorioFotografo.save(fotografo);
    }
}