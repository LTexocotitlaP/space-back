package mx.com.chicatanas.infrastructure.controller;

import feign.Response;
import mx.com.chicatanas.application.port.in.CasoUsoBuscarFoto;
import mx.com.chicatanas.application.port.in.CasoUsoEliminarFoto;
import mx.com.chicatanas.application.port.in.CasoUsoSubirFoto;
import mx.com.chicatanas.application.port.in.CasoUsoTomarFoto;
import mx.com.chicatanas.domain.Foto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/foto")
public class FotoController {
    private final CasoUsoSubirFoto casoUsoSubirFoto;
    private final CasoUsoBuscarFoto casoUsoBuscarFoto;
    private final CasoUsoTomarFoto casoUsoTomarFoto;
    private final CasoUsoEliminarFoto casoUsoEliminarFoto;

    public FotoController(CasoUsoSubirFoto casoUsoSubirFoto, CasoUsoBuscarFoto casoUsoBuscarFoto, CasoUsoTomarFoto casoUsoTomarFoto, CasoUsoEliminarFoto casoUsoEliminarFoto) {
        this.casoUsoSubirFoto = casoUsoSubirFoto;
        this.casoUsoBuscarFoto = casoUsoBuscarFoto;
        this.casoUsoTomarFoto = casoUsoTomarFoto;
        this.casoUsoEliminarFoto = casoUsoEliminarFoto;
    }

    @PostMapping("/capturar")
    public ResponseEntity<Foto> crearFoto(@RequestBody Foto foto) {
        return ResponseEntity.ok(casoUsoTomarFoto.tomarFoto(foto));
    }

    @PostMapping("/subir")
    public ResponseEntity<Foto> subirFoto(@RequestBody Foto foto) {
        return ResponseEntity.ok(casoUsoSubirFoto.subirFoto(foto));
    }

}
