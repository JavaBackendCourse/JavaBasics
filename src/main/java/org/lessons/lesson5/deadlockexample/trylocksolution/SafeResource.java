package org.lessons.lesson5.deadlockexample.trylocksolution;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SafeResource {
    private final Lock lock = new ReentrantLock();
    private final String name;

    public SafeResource(String name) {
        this.name = name;
    }

    public boolean tryLock() {
        return lock.tryLock();
    }

    public void unlock() {
        lock.unlock();
    }

    public String getName() {
        return name;
    }
}
