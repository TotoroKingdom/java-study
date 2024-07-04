package com.totoro.javastudy.juc;

public class ThreadPriority {
    public static void main(String[] args) {

        Thread t1 = new Thread(() ->{
            System.out.println("t1");
        });

        Thread t2 = new Thread(() ->{
            System.out.println("t2");
        });

        Thread t3 = new Thread(() ->{
            System.out.println("t3");
        });

        System.out.println(t1.getPriority());
        t1.setPriority(1);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(10);
        System.out.println(t1.getPriority());
        t1.start();
        t2.start();
        t3.start();
    }
}
