package org.example.weatherapi.configurations;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "org.example.weatherapi.proxies")
public class ProjectConfig {
}
