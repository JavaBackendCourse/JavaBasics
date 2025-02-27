package org.lessons.lesson1.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputWithoutScanner {
    public static void main(String[] args)  {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(reader);

            System.out.println("Enter your name: ");

            String name = bufferedReader.readLine();

            System.out.println("Enter your age: ");

            String age = bufferedReader.readLine(); // reads everything as String

            System.out.println("Hello, " + name + "!");
            System.out.println("You are " + age + " years old.");

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
