package org.lessons.lesson3.oop.basic;

import java.time.LocalDate;

public class SimpleClassExample {
    public static void main(String[] args) {
        Person john = new Person(
                "John",
                LocalDate.of(1996, 1, 6),
                "john96@gmail.com"
        );

//        System.out.println(john);
        john.introduce();

        Person chris = new Person(
                "Chris",
                LocalDate.of(
                        1987,
                        8,
                        23
                ),
                "ch@gmail.com"
        );

//        System.out.println(chris);
        chris.introduce();

        Person jenifer = new Person(
                "Jenifer",
                LocalDate.of(1998, 5, 25),
                "jn@gmail.com"
        );

//        System.out.println(jenifer);

        jenifer.introduce();
    }
}
