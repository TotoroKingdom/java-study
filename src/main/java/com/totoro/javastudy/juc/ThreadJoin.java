package com.totoro.javastudy.juc;

public class ThreadJoin {

    public static void main(String[] args) {

        Thread t1 = new Thread(() ->{
            System.out.println("线程1开始运行！");
            for (int i = 0; i < 50; i++) {
                System.out.println("线程1打印：" + i);
            }
            System.out.println("线程1结束");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("线程2开始运行！");
            for (int i = 0; i < 50; i++) {
                System.out.println("线程2打印：" + i);
                if (i == 10){
                    try{
                        System.out.println("线程1加入到此线程");
                        t1.join();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();

    }
}
