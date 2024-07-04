package com.totoro.javastudy.juc;

public class ThreadTest1 {
    public static void main(String[] args) {

        Thread t = new Thread(() ->{
            System.out.println("我是线程：" + Thread.currentThread().getName());
            System.out.println("我正在计算0-10000 之间所有数的和。。。");
            int sum = 0;
            for (int i = 0; i < 10000; i++) {
                sum += i;
            }
            System.out.println("结果：" + sum);
        });
        t.start();
        System.out.println("我是主线程");

    }
}
