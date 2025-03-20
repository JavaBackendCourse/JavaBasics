package org.lessons.lesson7.multitaskingexample.withclienthandler.message;

import java.io.Serializable;

public class PackageData implements Serializable {
    private String message;
    private String name;

    public PackageData(String name, String message) {
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
