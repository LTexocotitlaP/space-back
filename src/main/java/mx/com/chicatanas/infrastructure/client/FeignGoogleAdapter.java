package mx.com.chicatanas.infrastructure.client;

import mx.com.chicatanas.application.dto.WeatherResponse;
import mx.com.chicatanas.application.port.out.PuertoFeignClima;
import org.springframework.stereotype.Component;

@Component
public class FeignGoogleAdapter implements PuertoFeignClima {

    private final GoogleFeignClient googleFeignClient;

    public FeignGoogleAdapter(GoogleFeignClient googleFeignClient) {
        this.googleFeignClient = googleFeignClient;
    }

    @Override
    public WeatherResponse getWeatherByCity(Long longitud, Long latitud) {
        return null;
    }
}