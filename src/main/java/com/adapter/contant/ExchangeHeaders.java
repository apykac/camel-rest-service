package com.adapter.contant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ExchangeHeaders {
    /** хедер в {@link org.apache.camel.Exchange} в котором хранится ид сервиса из которого получаем температуру */
    public static final String WEATHER_SERVICE_ID_HEADER = "weather_service_id";
    /** хедер в {@link org.apache.camel.Exchange} в котором хранится значение полученной температуры */
    public static final String WEATHER_TEMP_HEADER = "weather_temp";
}
