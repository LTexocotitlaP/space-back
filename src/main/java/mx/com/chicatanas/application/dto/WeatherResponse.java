package mx.com.chicatanas.application.dto;

public record WeatherResponse(
        String currentTime,
        TimeZone timeZone,
        boolean isDaytime,
        WeatherCondition weatherCondition,
        Temperature temperature,
        Temperature feelsLikeTemperature,
        Temperature dewPoint,
        Temperature heatIndex,
        Temperature windChill,
        int relativeHumidity,
        int uvIndex,
        Precipitation precipitation,
        int thunderstormProbability,
        AirPressure airPressure,
        Wind wind,
        Visibility visibility,
        int cloudCover,
        CurrentConditionsHistory currentConditionsHistory
) {}