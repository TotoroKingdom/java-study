package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.Exchanger;

/**
 * @author totoro
 * @date 2024年07月11日 16:16
 * @description
 */

public class ExchangeTest1 {
    public static void main(String[] args) {

        Exchanger<String> exchanger = new Exchanger<>();
        Thread tom = new Thread(() ->{
            try {
                String result = exchanger.exchange("我是tom");
                System.out.println("tom收到的消息："+result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread jerry = new Thread(() ->{
            try {
                String result = exchanger.exchange("我是jerry");
                System.out.println("jerry收到的消息："+result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread bob = new Thread(() ->{

            try {
                String result = exchanger.exchange("我是bob");
                System.out.println("bob收到的消息："+result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        tom.start();
        jerry.start();
        bob.start();


    }
}
