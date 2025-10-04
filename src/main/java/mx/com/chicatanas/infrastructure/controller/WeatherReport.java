package mx.com.chicatanas.infrastructure.controller;

import mx.com.chicatanas.infrastructure.client.GoogleFeignClient;
import mx.com.chicatanas.infrastructure.client.dto.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weather")
public class WeatherReport {

    private final GoogleFeignClient googleFeignClient;

    @Value("${googlemaps.api.key}")
    private String apiKey;

    public WeatherReport(GoogleFeignClient googleFeignClient) {
        this.googleFeignClient = googleFeignClient;
    }

    @GetMapping
    public WeatherResponse getWeatherFromPosition(@RequestParam double latitude, @RequestParam double longitude) {
        return googleFeignClient.getCurrentConditions(apiKey, latitude, longitude);
    }
}
