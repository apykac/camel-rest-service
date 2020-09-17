package com.adapter.exception;

/**
 * тип ошибки
 * @see ErrorCode#VALIDATION - ошибка валидации
 * @see ErrorCode#EXTERNAL_SERVICE - ошибка подключения к внешнему сервису
 * @see ErrorCode#UNEXPECTED - неожиданная (не прогнозируемая ошибка)
 */
public enum ErrorCode {
    VALIDATION, EXTERNAL_SERVICE, UNEXPECTED
}
