package org.lessons.lesson1.exceptions.custom;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            if (b == 0)
                throw new CustomException(
                        "cannot divide by zero",
                        500
                );

            int c = a / b;

            System.out.println("Result: " + c);
        } catch (Exception e) {
            System.out.println("Custom exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
