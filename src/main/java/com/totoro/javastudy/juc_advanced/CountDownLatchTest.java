package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.CountDownLatch;

/**
 * @author totoro
 * @date 2024年07月11日 11:50
 * @description
 */

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(40);
        for (int i = 0; i < 40; i++) {
            int finalI = i;


            Thread thread = new Thread (() ->{
                latch.countDown();

            });
            thread.start();
        }
        System.out.println(latch.getCount());
        latch.await();
        System.out.println(latch.getCount());


    }
}
