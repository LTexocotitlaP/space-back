package mx.com.chicatanas.application.port.out;

import mx.com.chicatanas.application.dto.WeatherResponse;

public interface PuertoFeignClima {

    WeatherResponse getWeatherByCity(Long longitud, Long latitud);

}