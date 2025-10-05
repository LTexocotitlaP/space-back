package mx.com.chicatanas.application.dto;

public record WeatherCondition(
        String iconBaseUri,
        Description description,
        String type
) {}