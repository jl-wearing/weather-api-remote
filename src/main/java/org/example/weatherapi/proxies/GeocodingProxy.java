package org.example.weatherapi.proxies;

import org.example.weatherapi.dto.Coordinates;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "geocoding", url = "${geocoding.service.url}")
public interface GeocodingProxy {
    @GetMapping("")
    List<Coordinates> getLatandLon(
            @RequestParam("q") String city,
            @RequestParam("limit") int maxResults,
            @RequestParam("appid") String apiKey
    );
}
