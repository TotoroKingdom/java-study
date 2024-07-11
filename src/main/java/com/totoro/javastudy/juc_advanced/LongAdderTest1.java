package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author totoro
 * @date 2024年07月11日 9:48
 * @description
 */

public class LongAdderTest1 {
    public static void main(String[] args) throws Exception {

        //对比AtomicLong和LongAdder消耗的时间。
        System.out.println("AtomicLong: " + atomicLongTest());
        System.out.println("LongAdder: " + longAdderTest());


    }

    private static long longAdderTest() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(100);
        LongAdder adder = new LongAdder();
        long start = System.currentTimeMillis();
        Runnable r = () ->{
            for (int i = 0; i < 10000; i++) {
                adder.increment();
            }
            latch.countDown();
        };

        for (int i = 0; i < 100; i++) {
            new Thread(r).start();
        }

        latch.await();

        return System.currentTimeMillis() - start;

    }

    private static long atomicLongTest() throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(100);
        AtomicLong adder = new AtomicLong();
        long start = System.currentTimeMillis();
        Runnable r = () ->{
            for (int i = 0; i < 10000; i++) {
                adder.incrementAndGet();
            }
            latch.countDown();
        };

        for (int i = 0; i < 100; i++) {
            new Thread(r).start();
        }
        latch.await();

        return System.currentTimeMillis() - start;

    }
}
