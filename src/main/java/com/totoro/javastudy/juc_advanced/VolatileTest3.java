package com.totoro.javastudy.juc_advanced;

public class VolatileTest3 {

    /**
     * volatile关键字，JMM会把该线程本地内存的变量强制刷新到主内存。
     * 并且这个写操作会导致其他线程中的volatile变量缓存无效。
     * 另一个线程修改变量时，会立即通知当前线程，并更新工作内存中的变量。
     */
    private static volatile int a = 0;
    public static void main(String[] args) throws InterruptedException {


            new Thread(() ->{
                while (a == 0){
                    System.out.println("loop");
                }
                System.out.println("over");
            }).start();

            Thread.sleep(1000);

            System.out.println("update a value");
            a = 1;



    }
}
