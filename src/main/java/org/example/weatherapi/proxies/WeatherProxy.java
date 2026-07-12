package org.example.weatherapi.proxies;

import org.example.weatherapi.dto.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "weather", url = "${weather.service.url}")
public interface WeatherProxy {
    @GetMapping("")
    WeatherResponse getWeatherData(
            @RequestParam("lat") double latitude,
            @RequestParam("lon") double longitude,
            @RequestParam("appid") String apiKey);
}
