package org.lessons.lesson4.simple_console_application.customexception;

public class CustomException extends RuntimeException {
    private String message;
    private int code;

    public CustomException(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
