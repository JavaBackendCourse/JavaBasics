package org.lessons.lesson3.oop.basic;

import java.time.LocalDate;

public class Person {
    private String name; // приватные переменные инкапсулированы внутри этого класса и к ним нет прямого досутпа извне
    private LocalDate dateOfBirth;
    private String email;

    public Person(String name, LocalDate dateOfBirth, String email) { // Конструктор со всеми параметрами
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public Person(String name) { // Конструктор с одним параметром
        this.name = name;
    }

    public String getName() { // Getter позволяет получить доступ к приватной переменной извне
        return name;
    }

    public void setName(String name) { // Setter позволяет изменить значение приватной перемемнной извне
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() { // Переопределяем метод toString()
        return String.format(
                "Person {name=%s, dateOfBirth=%s, email=%s}",
                name, dateOfBirth.toString(), email
        );
    }

    public void introduce() { // кастомный метод класса Person
        System.out.println(
                "Hello, my name is " + name + "!"
        );
    }

}
