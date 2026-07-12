package org.example.weatherapi.dto;

import lombok.Builder;

@Builder
public record WeatherResponse(String response) {
}
