package com.adapter.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfiguration {
    /**
     * @param builder настройщик компонента
     * @return компонент для REST подключения к адаптируемому сервису
     */
    @Bean
    public RestTemplate microserviceBRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    /**
     * @param builder настройщик компонента
     * @return компонент для REST подключения к сервисам погоды
     */
    @Bean
    public RestTemplate commonWeatherRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
