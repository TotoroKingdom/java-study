package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author totoro
 * @date 2024年07月11日 11:20
 * @description
 */

public class ThreadPoolExecutorTest1 {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger a = new AtomicInteger(1);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 4, 3, TimeUnit.SECONDS
                , new ArrayBlockingQueue<>(2)
                , (ThreadFactory) (r) -> {
                    return new Thread(r, "个人自定义线程：" + a.getAndIncrement());
                }
                , new ThreadPoolExecutor.DiscardOldestPolicy()
        );

        executor.execute(() ->{
            System.out.println(Thread.currentThread().getName());
            throw new RuntimeException("我是异常！");
        });

        TimeUnit.SECONDS.sleep(1);
        executor.execute(()->{
            System.out.println(Thread.currentThread().getName());
        });

    }
}
