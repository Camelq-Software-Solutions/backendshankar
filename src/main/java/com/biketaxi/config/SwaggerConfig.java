package com.biketaxi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "Bike Taxi API", version = "1.0", description = "API documentation for Bike Taxi App")
)
public class SwaggerConfig {
} 