package com.totoro.javastudy.juc;

public class ThreadLocalTest2 {

    public static void main(String[] args) throws InterruptedException {

        ThreadLocal<String> local = new ThreadLocal<>();

        Thread t1 = new Thread(() ->{
            local.set("totoro");
            System.out.println("线程1变量值已设定");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("线程1读取变量值");
            System.out.println(local.get());
        });

        Thread t2 = new Thread(() -> {
            local.set("yyds");
            System.out.println("线程2变量值已设定");
        });



        t1.start();
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(3000);
        System.out.println("主线程"+local.get());
    }
}
