package com.project.BodaProject.config;

import com.project.BodaProject.api.ExhibitionApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExhibitionConfig {
    @Bean
    public ExhibitionApi exhibitionApiAll() {
        return new ExhibitionApi();
    }
}
