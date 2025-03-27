package org.lessons.lesson10.syncexample;

public class SyncExample {
    public static void main(String[] args) {
        System.out.println("Основной поток запущен!");
        firstLogic();
        secondLogic();
        System.out.println("Основной поток завершен!");
    }

    private static void firstLogic() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Первая логика: " + i);
        }
    }

    private static void secondLogic() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Вторая логика: " + i);
        }
    }
}
