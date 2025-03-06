package org.lessons.lesson4.functioninterfaces.example2;

public class TaskDProcessor implements Processor {
    @Override
    public void process() {
        System.out.println("Task D is processing");
    }
}
