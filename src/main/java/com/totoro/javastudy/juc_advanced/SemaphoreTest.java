package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.Semaphore;

/**
 * @author totoro
 * @date 2024年07月11日 14:48
 * @description
 */

public class SemaphoreTest {
    public static void main(String[] args) throws InterruptedException {

        Semaphore semaphore = new Semaphore(3);

        for (int i = 0; i < 5; i++) {
            new Thread(() ->{
                try {
                    semaphore.acquire(2);
                    System.out.println("许可证申请成功");
                } catch (Exception e){
                    e.printStackTrace();
                }
            }).start();
        }

        Thread.sleep(400);
        System.out.println("剩余许可证数量：" + semaphore.availablePermits());
        System.out.println("是否存在线程等待许可证：" + semaphore.hasQueuedThreads());
        System.out.println("等待许可线程数量：" + semaphore.getQueueLength());
        System.out.printf("收回剩余许可数量：" + semaphore.drainPermits());

    }
}
