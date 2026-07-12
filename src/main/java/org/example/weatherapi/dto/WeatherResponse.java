package org.example.weatherapi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class WeatherResponse {
    private Coord coord;
    private List<Weather> weather;
    private Main main;
    private Wind wind;

    // Inner classes for the JSON response.
    @Data
    @NoArgsConstructor
    public static class Coord {
        private double lon;
        private double lat;
    }

    @Data
    @NoArgsConstructor
    public static class Weather {
        private String main;
        private String description;
        private String icon;
    }

    @Data
    @NoArgsConstructor
    public static class Main {
        private Double temp;
        private Double feels_like;
        private Double temp_min;
        private Double temp_max;
        private Double pressure;
        private Double humidity;
    }

    @Data
    @NoArgsConstructor
    public static class Wind {
        private Double speed;
        private Double deg;
        private Double gust;
    }
}