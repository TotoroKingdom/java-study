package com.totoro.javastudy.juc;

public class ThreadLocalTest3 {
    public static void main(String[] args) {

        ThreadLocal<String> local = new ThreadLocal<>();
        Thread t = new Thread(() ->{
            local.set("totoro");
            new Thread(() ->{
                System.out.println(local.get());
            }).start();
        });
        t.start();

    }
}
