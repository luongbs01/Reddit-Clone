package com.example.springredditclone.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI API() {
        return new OpenAPI()
                .info(new Info()
                        .title("Reddit Clone API")
                        .description("API for Reddit Clone Application")
                        .version("v0.0.1")
                );
    }
}
