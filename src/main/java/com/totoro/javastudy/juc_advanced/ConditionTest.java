package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {

    public static void main(String[] args) throws InterruptedException {

        Lock testLock = new ReentrantLock();
        Condition condition = testLock.newCondition();

        new Thread(() ->{
            testLock.lock(); // 必须持有锁，才能使用await;
            System.out.println("thread 1 is waiting");
            try{
                condition.await();
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
            condition.signal(); //唤醒
            System.out.println("thread 2 over");
            testLock.unlock();
        }).start();


    }
}
