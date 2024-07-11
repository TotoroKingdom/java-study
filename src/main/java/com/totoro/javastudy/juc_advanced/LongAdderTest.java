package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author totoro
 * @date 2024年07月11日 9:38
 * @description
 */

public class LongAdderTest {
    public static void main(String[] args) throws InterruptedException {

        LongAdder adder = new LongAdder();

        long start = System.currentTimeMillis();

        Runnable r = () ->{
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                adder.add(1);
            }
        };

        for (int i = 0; i < 100; i++) {
            new Thread(r).start();
        }

        for (;;){
            if (adder.sum() == 10000l){
                long end = System.currentTimeMillis();
                System.out.println("100个线程消耗："+(end-start)/1000 + " 秒");
                break;
            }
        }



    }
}
