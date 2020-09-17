package com.adapter.client;

import com.adapter.exception.InternalException;

public interface RestClient {
    /**
     * Вызов REST сервиса
     * @param o объект передаваемые сервису, будет сериализован в JSON
     * @return возвращает ответ от сервиса
     * @throws InternalException ошибка подключения
     */
    Object callService(Object o) throws InternalException;
}
