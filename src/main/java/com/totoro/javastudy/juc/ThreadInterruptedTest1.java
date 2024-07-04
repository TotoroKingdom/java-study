package com.totoro.javastudy.juc;

public class ThreadInterruptedTest1 {

    public static void main(String[] args) {

        Thread t = new Thread(() ->{
            System.out.println("线程开始运行！");
            while (true){
                if (Thread.currentThread().isInterrupted()){
                    System.out.println("发现中断信号，复位，继续运行。。。。");
                    Thread.interrupted();
                }
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
