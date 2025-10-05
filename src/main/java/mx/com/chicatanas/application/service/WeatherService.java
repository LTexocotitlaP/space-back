package mx.com.chicatanas.application.service;

import mx.com.chicatanas.application.dto.WeatherResponse;
import mx.com.chicatanas.application.port.in.CasoUsoConsultarClima;
import mx.com.chicatanas.application.port.in.CasoUsoCrearFotografo;
import mx.com.chicatanas.application.port.out.PuertoFeignClima;
import mx.com.chicatanas.domain.Fotografia;
import org.springframework.stereotype.Service;

@Service
public class WeatherService implements CasoUsoCrearFotografo, CasoUsoConsultarClima {

    private final PuertoFeignClima puertoFeignClima;

    public WeatherService(PuertoFeignClima puertoFeignClima) {
        this.puertoFeignClima = puertoFeignClima;
    }

    @Override
    public WeatherResponse consultarClima(Long longitud, Long latitud) {
        return null;
    }

    @Override
    public Fotografia crearFotografo(Fotografia fotografo) {
        return null;
    }
}