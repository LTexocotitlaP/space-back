package mx.com.chicatanas.infrastructure.controller;

import mx.com.chicatanas.application.dto.WeatherRequest;
import mx.com.chicatanas.application.dto.WeatherResponse;
import mx.com.chicatanas.application.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weather")
public class WeatherReport {

    private final WeatherService weatherService;

    public WeatherReport(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @PostMapping
    public ResponseEntity<WeatherResponse> getWeather(@RequestBody WeatherRequest weatherRequest) {
        return ResponseEntity.ok(weatherService.consultarClima(weatherRequest));
    }
}