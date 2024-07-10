package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest2 {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        new Thread(() ->{
            lock.lock();
            try {
                condition.await();
            } catch (Exception e){
                e.printStackTrace();
            }
        }).start();

        TimeUnit.SECONDS.sleep(1);
        lock.lock();

        System.out.println("当前condition的等待线程数量：" + lock.getWaitQueueLength(condition));
        condition.signal();
        System.out.println("当前condition的等待线程数量：" + lock.getWaitQueueLength(condition));
        lock.unlock();

    }
}
