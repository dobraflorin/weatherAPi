package org.example.models.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class WeatherDTO {

    private String city;
    private double weatherTemperature;
    private int weatherHumidity;
}