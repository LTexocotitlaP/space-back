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
) {

    public record TimeZone(String id) {}

    public record WeatherCondition(
            String iconBaseUri,
            Description description,
            String type
    ) {
        public record Description(String text, String languageCode) {}
    }

    public record Temperature(double degrees, String unit) {}

    public record Precipitation(
            Probability probability,
            Qpf qpf
    ) {
        public record Probability(int percent, String type) {}
        public record Qpf(double quantity, String unit) {}
    }

    public record AirPressure(double meanSeaLevelMillibars) {}

    public record Wind(
            Direction direction,
            Speed speed,
            Gust gust
    ) {
        public record Direction(double degrees, String cardinal) {}
        public record Speed(double value, String unit) {}
        public record Gust(double value, String unit) {}
    }

    public record Visibility(double distance, String unit) {}

    public record CurrentConditionsHistory(
            TemperatureChange temperatureChange,
            Temperature maxTemperature,
            Temperature minTemperature,
            Qpf qpf
    ) {
        public record TemperatureChange(double degrees, String unit) {}
        public record Qpf(double quantity, String unit) {}
    }
}