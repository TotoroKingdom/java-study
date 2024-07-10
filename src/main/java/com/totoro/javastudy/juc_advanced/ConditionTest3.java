package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest3 {
    public static void main(String[] args) throws InterruptedException {
        Lock testLock = new ReentrantLock();
        new Thread(() -> {
            testLock.lock();
            try {
                System.out.println("等待是否未超时："+testLock.newCondition().await(1, TimeUnit.SECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            testLock.unlock();
        }).start();
    }
}
