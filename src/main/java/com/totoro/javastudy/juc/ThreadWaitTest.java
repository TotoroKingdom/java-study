package com.totoro.javastudy.juc;

public class ThreadWaitTest {

    public static void main(String[] args) throws InterruptedException {

        Object o1 = new Object();
        Thread t1 = new Thread(() ->{
            synchronized(o1){
                try {
                    System.out.println("开始等待");
                    o1.wait();  //开始等待并且释放锁
                    System.out.println("等待结束");
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() ->{
            synchronized (o1){
                System.out.println("开始唤醒！");
                o1.notify(); //唤醒等待线程，等待线程要等这个线程释放锁
                for (int i = 0; i < 50; i++) {
                    System.out.println(i);
                }
            }
        });

        t1.start();
        Thread.sleep(1000);
        t2.start();


    }
}
