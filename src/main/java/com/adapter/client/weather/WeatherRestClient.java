package com.adapter.client.weather;

import com.adapter.exception.InternalException;

import java.math.BigInteger;

public interface WeatherRestClient {
    /**
     * получаем погоду из определенного сервиса погоды
     *
     * @param serviceId ид сервиса погоды
     * @param latitude  широта
     * @param longitude долгота
     * @return возвращает полученное значение темепратуры
     * @throws InternalException ошибка в случае, получения данных из сервиса, либо проблемы при поиске значения температуры
     */
    BigInteger getTemp(String serviceId, String latitude, String longitude) throws InternalException;
}
