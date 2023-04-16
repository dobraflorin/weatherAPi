package org.example.services;

import org.example.models.dto.WeatherDTO;

import java.util.List;

public interface WeatherService {

    WeatherDTO storeWeatherObservation(WeatherDTO weatherDTO);

    List<WeatherDTO> getWeatherObservations();

    WeatherDTO deleteWeatherObservationByCity(String cityName);

    WeatherDTO updateWeather(WeatherDTO weatherDTO);
}