package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockTest3 {
    public static void main(String[] args) {

        ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
        Runnable action = () ->{
            System.out.println("线程 " + Thread.currentThread().getName() + "一秒钟后获取锁");
            lock.writeLock().lock();
            System.out.println("线程 " + Thread.currentThread().getName() + "成功获取锁");
            lock.writeLock().unlock();
        };
        for (int i = 0; i < 10; i++) {
            new Thread(action, "T" + i).start();
        }

    }
}
