package com.totoro.javastudy.juc;

public class ThreadSleepTest {

    public static void main(String[] args) {

        Thread t = new Thread(() ->{

            try{
                Thread.sleep(10000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        t.start();
        try{
            Thread.sleep(3000);
            t.interrupt();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
