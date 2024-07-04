package com.totoro.javastudy.juc;

public class ThreadStopTest {

    public static void main(String[] args) {

        Thread thread = new Thread(() ->{
            Thread me = Thread.currentThread();
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
                if (i == 20){
                    me.stop();
                }
            }
        });

        thread.start();

    }
}
