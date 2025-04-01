package org.lessons.lesson11.formats.csv.model;

public class Person4 {
    private String name;
    private int age;
    private String email;

    public Person4() {
    } // Пустой конструктор необходим для библиотеки Jackson

    public Person4(String name, int age, String email) {
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
