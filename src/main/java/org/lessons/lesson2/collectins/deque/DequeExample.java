package org.lessons.lesson2.collectins.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> customerDeque = new ArrayDeque<>();

        customerDeque.addLast("Alice");
        customerDeque.addLast("Bob");
        customerDeque.addFirst("VIP John");
        customerDeque.addLast("Charlie");

        System.out.println("Очередь: " + customerDeque);

        // Достаем элемент с начала очереди и убираем его из очереди
        System.out.println("Обсулживание первого клиента в очереди: " + customerDeque.pollFirst());
        System.out.println("Очередь после обсулуживания первого клиента в очереди: " + customerDeque);

        // Достаем элемент с конца очереди и убираем его из очереди
        System.out.println("Обсулживание последнего клиента в очереди: " + customerDeque.pollLast());
        System.out.println("Очередь после обслуживания последнего клиента в очереди: " + customerDeque);

        // Проверка кто следующий в очереди
        System.out.println("Следующий клиента в очереди: " + customerDeque.peekFirst());

        // Обслуживаем оставшихся клиентов
        while (!customerDeque.isEmpty()) {
            System.out.println("Обсулживание: " + customerDeque.pollFirst());
        }

        // Проверка пуста ли очередь
        System.out.println("Очередь пуста? " + customerDeque.isEmpty());
    }
}
