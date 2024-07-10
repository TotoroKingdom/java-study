package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest2 {

    public static void main(String[] args) throws InterruptedException {
        Lock testLock = new ReentrantLock();

        new Thread(() ->{
            testLock.lock();
            System.out.println("thead 1 is wait");
            try{
                testLock.newCondition().await();
            } catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("thread 1 is over");
            testLock.unlock();
        }).start();

        Thread.sleep(100);

        new Thread(() ->{
            testLock.lock();
            System.out.println("thread 2 awake other thread");
            testLock.newCondition().signal();
            System.out.println("thread 2 is over");
            testLock.unlock();
        }).start();

    }
}
