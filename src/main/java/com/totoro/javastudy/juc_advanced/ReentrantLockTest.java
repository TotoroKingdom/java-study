package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    public static void main(String[] args) throws InterruptedException {

        ReentrantLock  lock = new ReentrantLock();
        lock.lock();
        System.out.println("第一次加锁    当前加锁次数：" + lock.getHoldCount() + " 是否被锁：" + lock.isLocked());
        lock.lock();
        System.out.println("第二次加锁    当前加锁次数：" + lock.getHoldCount() + " 是否被锁：" + lock.isLocked());

        new Thread(() ->{
            System.out.println("线程中    当前加锁次数：" + lock.getHoldCount() + " 是否被锁：" + lock.isLocked());
            lock.lock();
            System.out.println("线程中加锁  当前加锁次数：" + lock.getHoldCount() + " 是否被锁：" + lock.isLocked());
        }).start();

        lock.unlock();
        System.out.println("第一次解锁  当前加锁次数：" + lock.getHoldCount() + " 是否被锁：" + lock.isLocked());
        TimeUnit.SECONDS.sleep(1);

        lock.unlock();
        System.out.println("第二次解锁 当前加锁次数：" + lock.getHoldCount() + " 是否被锁：" + lock.isLocked());
    }
}
