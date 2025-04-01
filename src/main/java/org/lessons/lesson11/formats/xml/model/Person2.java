package org.lessons.lesson11.formats.xml.model;

public class Person2 {
    private String name;
    private int age;
    private String email;

    public Person2() {
    } // Пустой конструктор необходим для библиотеки Jackson

    public Person2(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
