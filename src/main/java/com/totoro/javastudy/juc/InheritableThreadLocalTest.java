package com.totoro.javastudy.juc;

public class InheritableThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal<String> local = new InheritableThreadLocal<>();

        Thread t = new Thread(() ->{
            local.set("totoro");
            new Thread(() ->{
                System.out.println(local.get());
            }).start();
        });
        t.start();

        System.out.println(local.get());


    }
}
