package org.lessons.lesson1.conditions;

public class Operators {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//
//        // if-else
//        if (n % 2 == 0 && n < 100) {
//            System.out.println("even and less than 100");
//        }
//        if (n % 3 == 0 || n < 10) {
//            System.out.println("divisible by 3 and less than 10");
//        }
//        if (n % 5 == 0 && n != 25) {
//            System.out.println("divisible by 5 and greater than 25");
//        }


        // difference between && and &, || and |

        int c = 7;
        int d = 2;

        if (isEven(c) && isEven(d)) { // short-circuit AND operator. Если хотя бы одно условие не удовлетворяет то второе не проверяется
            System.out.println("Оба четные");
        } else {
            System.out.println("Какое-то из условий не удовлетворено");
        }

        if (isEven(d) && isEven(c)) {
            System.out.println("Оба четные");
        } else {
            System.out.println("Какое-то из условий не удовлетворено");
        }

        if (isEven(d) || isEven(c)) { // short-circuit OR operator. short-circuit AND operator. Если хотя бы одно условие удовлетворяет то второе не проверяется
            System.out.println("Хотя бы одно четное");
        } else {
            System.out.println("Оба условия не удовлетворены");
        }

        if(isEven(c) & isEven(d)) { // non-short-circuit AND operator. Оба условия проверяются в любом случае
            System.out.println("Оба четные");
        } else {
            System.out.println("Какое-то из условий не удовлетворено");
        }

        if(isEven(c) | isEven(d)) { // non-short-circuit OR operator. Оба условия проверяются в любом случае
            System.out.println("Хотя бы одно четное");
        } else {
            System.out.println("Оба условия не удовлетворены");
        }
    }

    private static boolean isEven(int n) {
        System.out.println("Проверяем на четность число: " + n);
        return n % 2 == 0;
    }
}
