package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest1 {

    public static void main(String[] args) throws InterruptedException {

        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        Thread t1 = new Thread(lock::lock);
        Thread t2 = new Thread(lock::lock);
        t1.start();
        t2.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("当前等待锁释放的线程数："+lock.getQueueLength());
        System.out.println("线程1是否在等待队列：" + lock.hasQueuedThread(t1));
        System.out.println("线程2是否在等待队列：" + lock.hasQueuedThread(t2));
        System.out.println("主线程是否在等待队列：" + lock.hasQueuedThread(Thread.currentThread()));


    }
}
