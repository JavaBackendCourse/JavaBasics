package org.lessons.lesson2.collectins.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<String>();

        // Добавление в очередь
        customerQueue.add("Alice");
        customerQueue.add("Bob");
        customerQueue.add("Charlie");
        customerQueue.add("David");


        int counter = 0;

        while(!customerQueue.isEmpty()) {
            System.out.println("\nИтерация: " + ++counter);

            System.out.println("Очередь клиентов: " + customerQueue);

            System.out.println("Обслуживание клиента: " + customerQueue.poll());
            System.out.println("Очередь после обслуживания клиента: " + customerQueue);

            System.out.println("Следуюший клиент: " + customerQueue.peek());
        }
    }
}
