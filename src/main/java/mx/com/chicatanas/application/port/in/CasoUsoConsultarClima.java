package mx.com.chicatanas.application.port.in;

import mx.com.chicatanas.application.dto.WeatherResponse;

public interface CasoUsoConsultarClima {

    WeatherResponse consultarClima(Long longitud, Long latitud);

}