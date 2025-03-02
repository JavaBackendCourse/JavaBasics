package org.lessons.lesson2.collectins.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        class Customer implements Comparable<Customer> {
            private final String name;
            private final int priority;

            public Customer(String name, int priority) {
                this.name = name;
                this.priority = priority;
            }

            public String getName() {
                return this.name;
            }

            public int getPriority() {
                return this.priority;
            }

            @Override
            public int compareTo(Customer other) {
                return Integer.compare(other.priority, this.priority);
            }

            @Override
            public String toString() {
                return name + " (Priority: " + priority + ")";
            }
        }

        Queue<Customer> customerQueue = new PriorityQueue<>();

        customerQueue.add(new Customer("Alice", 2));  // Regular customer
        customerQueue.add(new Customer("Bob", 5));    // VIP customer
        customerQueue.add(new Customer("Charlie", 1)); // Low priority
        customerQueue.add(new Customer("David", 4));   // High priority


        System.out.println("\nОбслуживание клиентов по их приоритетам:");

        while (!customerQueue.isEmpty()) {
            System.out.println("Обслуживание: " + customerQueue.poll());
        }
    }
}
