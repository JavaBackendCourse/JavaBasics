package org.lessons.lesson2.rescursion;

public class Recursion {
    public static void main(String[] args) {
        int n = 25;

        int result = fibonnaci(n);

        System.out.printf("\n%d-ое число Фибоначи = %d\n", n, result);

        for(int i = 0; i <= n; i++) {
            System.out.printf("%d ", fibonnaci(i));
        }

    }

    // 0 1 1 2 3 5 8 13 21
    public static int fibonnaci(int n) {
        if (n <= 1)
            return n;

        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }

    // f(5): f(4) + f(3) = 3 + 2 = 5
    // f(4): f(3) + f(2) = 2 + 1 = 3
    // f(3): f(2) + f(1) = 1 + 1 = 2
    // f(2): f(1) + f(0) = 1 + 0 = 1
    // f(1): 1
    // f(0): 0
}
