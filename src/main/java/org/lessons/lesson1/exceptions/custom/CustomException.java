package org.lessons.lesson1.exceptions.custom;

public class CustomException extends Exception {
    private String message;
    private int code;

    public CustomException(String message, int code) {
        this.message = message;
        this.code = code;
    }

    // Getters and setters
    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public int getCode() {
        return this.code;
    }
}
