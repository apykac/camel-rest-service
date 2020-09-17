package com.adapter.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Converter {
    /**
     * Перевод Фаренгейтов в Цельсии
     * @param fahrenheit значение температуры в Фаренгейтах в строковом виде
     * @return значение в Цельсиях
     */
    public static BigInteger fahrenheitToCelsius(String fahrenheit) {
        return fahrenheitToCelsius(new BigDecimal(fahrenheit));
    }

    /**
     * Перевод Фаренгейтов в Цельсии
     * @param fahrenheit значение температуры в Фаренгейтах
     * @return значение в Цельсиях
     */
    public static BigInteger fahrenheitToCelsius(BigDecimal fahrenheit) {
        return fahrenheit == null ? null : BigInteger.valueOf(fahrenheit.subtract(BigDecimal.valueOf(273.15)).longValue());
    }
}
