package com.totoro.javastudy.juc;

public class ThreadLocalTest {
    public static void main(String[] args) throws InterruptedException {

        ThreadLocal<String> local = new ThreadLocal<>();

        Thread t1 = new Thread(() ->{
            local.set("totoro");
            System.out.println("变量值已设定");
            System.out.println(local.get());
        });
        Thread t2 = new Thread(() ->{
            System.out.println(local.get());
        });

        t1.start();
        Thread.sleep(3000);
        t2.start();
    }
}
