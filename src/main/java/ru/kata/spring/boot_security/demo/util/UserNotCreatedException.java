package ru.kata.spring.boot_security.demo.util;

public class UserNotCreatedException extends RuntimeException {
    public UserNotCreatedException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
