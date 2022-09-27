package com.example.demo1.arguments.exception;

public class ValueNotFoundException extends Exception {
    public ValueNotFoundException(Throwable cause) {
        super(cause);
    }

    public ValueNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
