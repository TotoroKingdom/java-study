package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest1 {

    private static int i = 0;
    public static void main(String[] args) throws InterruptedException {

        Lock testLock = new ReentrantLock();  //可重入锁

        Runnable action = () ->{
            for (int j = 0; j < 100000; j++) {
                testLock.lock();//加锁
                i++;
                testLock.unlock();//解锁
            }
        };
        new Thread(action).start();
        new Thread(action).start();

        Thread.sleep(1000);
        System.out.println(i);

    }
}
