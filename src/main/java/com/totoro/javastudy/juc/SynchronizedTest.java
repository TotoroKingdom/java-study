package com.totoro.javastudy.juc;
public class SynchronizedTest {

    private static int value = 0;
    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (ThreadYield.class){
                    value++;
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (ThreadYield.class){
                    value++;
                }
            }
        }).start();

        Thread.sleep(1000);
        System.out.println(value);
    }
}
