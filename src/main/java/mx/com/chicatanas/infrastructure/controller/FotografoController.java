package mx.com.chicatanas.infrastructure.controller;

import mx.com.chicatanas.application.port.in.CasoUsoBuscarFotografo;
import mx.com.chicatanas.application.port.in.CasoUsoCrearFotografo;
import mx.com.chicatanas.domain.Fotografo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/fotografo")
public class FotografoController {

    private final CasoUsoCrearFotografo casoUsoCrearFotografo;
    private final CasoUsoBuscarFotografo casoUsoBuscarFotografo;

    public FotografoController(CasoUsoCrearFotografo casoUsoCrearFotografo, CasoUsoBuscarFotografo casoUsoBuscarFotografo) {
        this.casoUsoCrearFotografo = casoUsoCrearFotografo;
        this.casoUsoBuscarFotografo = casoUsoBuscarFotografo;
    }

    @PostMapping("/crear")
    public ResponseEntity<Fotografo> crearFotografo(@RequestBody Fotografo fotografo) {
        return ResponseEntity.ok(casoUsoCrearFotografo.crearFotografo(fotografo));
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Fotografo>> buscarFotografo(@PathVariable Long id) {
        return ResponseEntity.ok(casoUsoBuscarFotografo.buscarFotografo(id));
    }
}