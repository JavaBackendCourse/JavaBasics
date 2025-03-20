package org.lessons.practice.task3.exception;

public class InsufficientFundsException extends RuntimeException {
    private final String message;

    public InsufficientFundsException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
