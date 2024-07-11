package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.Exchanger;

/**
 * @author totoro
 * @date 2024年07月11日 14:54
 * @description
 */

public class ExchangerTest {
    public static void main(String[] args) throws InterruptedException {

        Exchanger<String> exchanger = new Exchanger<>();

        new Thread(() -> {
            try {
                System.out.println("收到其他线程传递的数据:" + exchanger.exchange(Thread.currentThread().getName()));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        System.out.println("收到其他线程传递的数据:" + exchanger.exchange(Thread.currentThread().getName()));

    }
}
