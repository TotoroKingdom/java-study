package com.totoro.javastudy.juc;

public class ThreadTest2 {
    public static void main(String[] args) {

        Thread t1 = new Thread(() ->{
            for (int i = 0; i < 100; i++) {
                System.out.println("我是"+Thread.currentThread().getName() + i);
            }
        },"t1");

        Thread t2 = new Thread(() ->{
            for (int i = 0; i < 100; i++) {
                System.out.println("我是"+Thread.currentThread().getName() + i);
            }
        },"t2");

        t1.start();
        t2.start();
    }
}
