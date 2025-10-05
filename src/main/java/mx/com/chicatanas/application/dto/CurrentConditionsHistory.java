package mx.com.chicatanas.application.dto;

public record CurrentConditionsHistory(
        TemperatureChange temperatureChange,
        Temperature maxTemperature,
        Temperature minTemperature,
        Qpf qpf
) {}