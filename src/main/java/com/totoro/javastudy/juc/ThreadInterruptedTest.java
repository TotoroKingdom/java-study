package com.totoro.javastudy.juc;

public class ThreadInterruptedTest {

    public static void main(String[] args) {

        Thread t = new Thread("线程开始运行！");
        while (true){
            if (Thread.currentThread().isInterrupted()){
                break;
            }
        }
        System.out.println("线程被中断");

        t.start();
        try{
            Thread.sleep(3000);
            t.interrupt();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }


}
