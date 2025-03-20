package org.lessons.practice.task3.exception;

public class InvalidAmountException extends RuntimeException {
    private final String message;

    public InvalidAmountException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
