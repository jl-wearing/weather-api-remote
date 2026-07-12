package org.example.weatherapi.controllers;

import org.example.weatherapi.dto.Coordinates;
import org.example.weatherapi.dto.WeatherResponse;
import org.example.weatherapi.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WeatherController {
    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/{city}")
    public ResponseEntity<WeatherResponse> getWeather(@PathVariable String city) {
        // Exchange the city name for latitudes and longitudes.
        List<Coordinates> coordinates = weatherService.getLatandLon(city);

        // Exchange the coordinates for weather data.

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new WeatherResponse(Arrays.toString(coordinates.toArray())));
    }
}
