package org.lessons.lesson7.simpleexample2.message;

import java.io.Serializable;

public class Data implements Serializable {
    private String message;
    private String name;

    public Data(String message, String name) {
        this.message = message;
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
