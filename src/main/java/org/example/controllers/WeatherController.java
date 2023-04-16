package org.example.controllers;

import jakarta.validation.Valid;
import org.example.models.dto.WeatherDTO;
import org.example.services.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Validated
public class WeatherController {

    private final WeatherService weatherService;
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @PostMapping("/api/weather")
    public ResponseEntity<WeatherDTO> storeWeather(@Valid @RequestBody  WeatherDTO weatherDTO) {
        return ResponseEntity.ok(weatherService.storeWeatherObservation(weatherDTO));
    }

    @GetMapping("/api/weather")
    public ResponseEntity<List<WeatherDTO>> getWeatherObservations() {
        return ResponseEntity.ok(weatherService.getWeatherObservations());
    }

    @DeleteMapping("/api/weather/{cityName}")
    public WeatherDTO deleteWeatherByCity(@PathVariable String cityName) {
        return weatherService.deleteWeatherObservationByCity(cityName);
    }

    @PutMapping("/api/weather")
    public ResponseEntity<WeatherDTO> updateWeather(@Valid @RequestBody  WeatherDTO weatherDTO) {
        return ResponseEntity.ok(weatherService.updateWeather(weatherDTO));
    }
}