package org.lessons.practice2.task2.models;

public class CountDown extends Thread {
    private int count;

    public CountDown(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Значение count не может быть меньше нуля!");
        }
        this.count = count;
    }

    @Override
    public void run() {
        try {
            while (count > 0) {
                Thread.sleep(1000);
                System.out.println(count);
                count--;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
