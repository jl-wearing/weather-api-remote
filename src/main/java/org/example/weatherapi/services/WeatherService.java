package org.example.weatherapi.services;

import org.example.weatherapi.dto.Coordinates;
import org.example.weatherapi.dto.WeatherResponse;
import org.example.weatherapi.exceptions.CityNotFoundException;
import org.example.weatherapi.proxies.GeocodingProxy;
import org.example.weatherapi.proxies.WeatherProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {
    private final GeocodingProxy geocodingProxy;
    private final WeatherProxy weatherProxy;

    @Value("${openweather.api.key}")
    private String apiKey;

    @Autowired
    public WeatherService(GeocodingProxy geocodingProxy, WeatherProxy weatherProxy) {
        this.geocodingProxy = geocodingProxy;
        this.weatherProxy = weatherProxy;
    }

    public List<Coordinates> getLatandLon(String city) {
        // get the latitude and longitude for a city.
        List<Coordinates> coordinates = geocodingProxy.getLatandLon(city, 1, apiKey);

        if (coordinates == null || coordinates.isEmpty())
            throw new CityNotFoundException("City not found");

        return coordinates;
    }

    public WeatherResponse getWeather(double lat, double lon) {
        // get the weather for the city.
        return weatherProxy.getWeatherData(lat, lon, apiKey);
    }
}
