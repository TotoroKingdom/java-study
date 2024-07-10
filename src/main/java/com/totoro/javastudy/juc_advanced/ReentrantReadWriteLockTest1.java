package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockTest1 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        lock.readLock().lock();

        new Thread(lock.readLock()::lock).start();

//        new Thread(lock.writeLock()::lock).start();

    }
}
