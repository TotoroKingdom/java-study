package com.totoro.javastudy.juc;

public class SynchronizedTest2 {
    private static int value = 0;
    private static synchronized void add(){
        value ++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->{
            for (int i = 0; i < 10000; i++) {
               add();
            }
            System.out.println("线程1完成");
        });

        Thread t2 = new Thread(() ->{
            for (int i = 0; i < 10000; i++) {
                add();
            }
            System.out.println("线程2完成");
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(value);

    }
}
