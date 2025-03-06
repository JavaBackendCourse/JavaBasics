package org.lessons.lesson4.functioninterfaces.example2;

public class FunctionalInterfaceExample2 {
    public static void main(String[] args) {
        Processor taskAProcessor = () -> System.out.println("Task A is processing"); // реализация интерфейса через лямбда выражения
        Processor taskBProcessor = () -> System.out.println("Task B is processing");
        Processor taskCProcessor = () -> System.out.println("Task C is processing");

        taskAProcessor.process();
        taskBProcessor.process();
        taskCProcessor.process();

        TaskDProcessor taskDProcessor = new TaskDProcessor(); // реализация интерфейса через явный класс
        taskDProcessor.process();

        Processor taskFProcessor = new Processor() { // реализация интерфейса через анонимный класс
            @Override
            public void process() {
                System.out.println("Task F is processing");
            }
        };

        taskFProcessor.process();
    }
}
