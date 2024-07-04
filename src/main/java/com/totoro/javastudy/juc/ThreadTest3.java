package com.totoro.javastudy.juc;

public class ThreadTest3 {
    private static int value = 0;
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() ->{
            for (int i = 0; i < 10000; i++) {
                value++;
            }
        });

        Thread t2 = new Thread(() ->{
            for (int i = 0; i < 10000; i++) {
                value++;
            }
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(value);

    }
}
