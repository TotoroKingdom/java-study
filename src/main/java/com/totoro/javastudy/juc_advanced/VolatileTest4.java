package com.totoro.javastudy.juc_advanced;

public class VolatileTest4 {

    /**
     * volatile 只能保证可见性，不能保证原子性
     */
    private static volatile int a = 0;

    public static void main(String[] args) throws InterruptedException {

        Runnable r = ()->{
            for (int i = 0; i < 10000; i++) {
                a++;
            }
            System.out.println("over");
        };
        new Thread(r).start();
        new Thread(r).start();

        Thread.sleep(1000);
        System.out.println(a);
    }
}
