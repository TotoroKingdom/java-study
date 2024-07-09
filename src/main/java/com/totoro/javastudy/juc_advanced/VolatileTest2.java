package com.totoro.javastudy.juc_advanced;

public class VolatileTest2 {

    private static int a = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() ->{
            while (a == 0){
                System.out.println("无限循环");
            }
            System.out.println("线程结束！");
        }).start();

        Thread.sleep(1000);

        System.out.println("正在修改a的值。。。");
        a = 1;

    }
}
