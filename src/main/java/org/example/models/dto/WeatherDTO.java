package org.example.models.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class WeatherDTO {

    @NotBlank(message = "The name of the city is mandatory.")
    private String city;

    /**
     * The highest temperature ever recorded on Earth was 56.7 degrees Celsius and the lowest temperature ever recorded on Earth
     * was -89.2 degrees Celsius. From this two value we will validate the temperature with a range from -100 to 100 Celsius Degrees,
     * safe to say that if we will exceed that, we will probably die.
     */

    @Min(-100)
    @Max(100)
    private double weatherTemperature;

    /**
     * Humidity range expressed as a percentage is generally from 0% to 100%, we will use these validations for the humidity field
     */

    @Min(0)
    @Max(100)
    private int weatherHumidity;
}