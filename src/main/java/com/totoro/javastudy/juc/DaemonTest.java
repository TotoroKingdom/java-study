package com.totoro.javastudy.juc;

public class DaemonTest {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() ->{
            while (true){
                try{
                    System.out.println("程序正常运行中。。。");
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t.setDaemon(true);
        t.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }


    }
}
