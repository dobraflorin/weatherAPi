package org.example.services;

import lombok.extern.slf4j.Slf4j;
import org.example.models.dto.WeatherDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class WeatherServiceImpl implements WeatherService {

    List<WeatherDTO> weatherList = new ArrayList<>();

    @Override
    public WeatherDTO storeWeatherObservation(WeatherDTO weatherDTO) {
        weatherList.add(weatherDTO);
        log.info("Weather Report has been created for " + weatherDTO.getCity() + " city.");
        return weatherDTO;
    }

    @Override
    public List<WeatherDTO> getWeatherObservations() {
        log.info("A list of all the weather reports has been generated." + weatherList);
        return weatherList;
    }

    @Override
    public WeatherDTO deleteWeatherObservationByCity(String cityName) {
        for (WeatherDTO weather : weatherList) {
            if (weather.getCity().equalsIgnoreCase(cityName)) {
                weatherList.remove(weather);
                log.info(weather.getCity() + " weather has been erased.");
                return weather;
            }
        }
        return null;
    }

    @Override
    public WeatherDTO updateWeather(WeatherDTO weatherDTO) {
        for (int index = 0; index < weatherList.size(); index++) {
            if (weatherList.get(index).getCity().equalsIgnoreCase(weatherDTO.getCity())) {
                weatherList.get(index).setWeatherTemperature(weatherDTO.getWeatherTemperature());
                weatherList.get(index).setWeatherHumidity(weatherDTO.getWeatherHumidity());
                log.info("Weather updated for " + weatherList.get(index).getCity());
                return weatherList.get(index);
            }
        }
        return null;
    }
}