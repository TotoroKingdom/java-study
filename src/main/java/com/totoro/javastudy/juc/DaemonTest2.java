package com.totoro.javastudy.juc;

public class DaemonTest2 {

    private static boolean flag = true;

    public static void main(String[] args) {

        Thread t1 = new Thread(() ->{
            while (flag){
                for (int i = 0; i < 10; i++) {
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        });

        Thread t1Daemon = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            flag = false;
        });

        t1Daemon.setDaemon(true);

        t1.start();
        t1Daemon.start();

    }


}
