package mx.com.chicatanas.infrastructure.controller;

import mx.com.chicatanas.application.port.in.CasoUsoBuscarFoto;
import mx.com.chicatanas.application.port.in.CasoUsoEliminarFoto;
import mx.com.chicatanas.application.port.in.CasoUsoSubirFoto;
import mx.com.chicatanas.application.port.in.CasoUsoTomarFoto;
import mx.com.chicatanas.domain.Foto;
import mx.com.chicatanas.domain.Ubicacion;
import mx.com.chicatanas.infrastructure.util.ImageUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1/foto")
public class FotoController {

    private final CasoUsoSubirFoto casoUsoSubirFoto;
    private final CasoUsoBuscarFoto casoUsoBuscarFoto;
    private final CasoUsoTomarFoto casoUsoTomarFoto;
    private final CasoUsoEliminarFoto casoUsoEliminarFoto;

    public FotoController(CasoUsoSubirFoto casoUsoSubirFoto,
                          CasoUsoBuscarFoto casoUsoBuscarFoto,
                          CasoUsoTomarFoto casoUsoTomarFoto,
                          CasoUsoEliminarFoto casoUsoEliminarFoto) {
        this.casoUsoSubirFoto = casoUsoSubirFoto;
        this.casoUsoBuscarFoto = casoUsoBuscarFoto;
        this.casoUsoTomarFoto = casoUsoTomarFoto;
        this.casoUsoEliminarFoto = casoUsoEliminarFoto;
    }

    @PostMapping("/capturar")
    public ResponseEntity<Foto> crearFoto(@RequestBody Foto foto) {
        return ResponseEntity.ok(casoUsoTomarFoto.tomarFoto(foto));
    }

    @PostMapping(value = "/subir", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Foto> subirFoto(
            @RequestParam("imagen") MultipartFile file,
            @RequestParam("latitud") Double latitud,
            @RequestParam("longitud") Double longitud) throws IOException {

        byte[] imagen = ImageUtils.compressImage(file.getBytes());
        Foto foto = new Foto(imagen, new Ubicacion(latitud, longitud));
        return ResponseEntity.ok(casoUsoSubirFoto.subirFoto(foto));
    }
}