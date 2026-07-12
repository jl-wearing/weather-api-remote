package org.example.weatherapi.services;

import org.example.weatherapi.dto.Coordinates;
import org.example.weatherapi.proxies.GeocodingProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {
    private final GeocodingProxy geocodingProxy;

    @Value("${openweather.api.key}")
    private String apiKey;

    @Autowired
    public WeatherService(GeocodingProxy geocodingProxy) {
        this.geocodingProxy = geocodingProxy;
    }

    public List<Coordinates> getLatandLon(String city) {
        // get the latitude and longitude for a city.

        return geocodingProxy.getLatandLon(city, 1, apiKey);
    }
}
