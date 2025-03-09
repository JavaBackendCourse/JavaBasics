package org.lessons.lesson5.livelockexample;

class SharedResource {
    private boolean isLocked = false;

    public synchronized boolean tryLock() {
        if (!isLocked) {
            isLocked = true;
            return true;
        }
        return false;
    }

    public synchronized void unlock() {
        isLocked = false;
    }
}