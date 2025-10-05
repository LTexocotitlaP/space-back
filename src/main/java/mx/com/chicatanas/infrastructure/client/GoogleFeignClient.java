package mx.com.chicatanas.infrastructure.client;

import mx.com.chicatanas.application.dto.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "google-client", url = "${googlemaps.api.url}")
public interface GoogleFeignClient {
    @GetMapping("/currentConditions:lookup")
    WeatherResponse getCurrentConditions(@RequestParam("location.latitude") double latitude, @RequestParam("location.longitude") double longitude);
}