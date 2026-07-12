package org.example.weatherapi.dto;

import lombok.Builder;

@Builder
public record Coordinates(Double lat, Double lon) {
}
