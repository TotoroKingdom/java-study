package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.*;

/**
 * @author totoro
 * @date 2024年07月11日 10:49
 * @description
 */

public class ThreadPoolExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2
                , 4
                , 3
                , TimeUnit.SECONDS
//                , new ArrayBlockingQueue<>(2)
                , new SynchronousQueue<>()
                , new ThreadFactory() {
                    int count = 0;
                    @Override
                    public Thread newThread(Runnable r) {
                        return new Thread(r, "我的自定义线程-"+ count++);
                    }
        }
//                , new ThreadPoolExecutor.AbortPolicy());  //默认，抛异常
//                , new ThreadPoolExecutor.CallerRunsPolicy()); //让提交任务的线程去运行任务
//                , new ThreadPoolExecutor.DiscardOldestPolicy()); //丢弃最早加入队列的一个任务
                , new ThreadPoolExecutor.DiscardPolicy()); //什么也不做

        for (int i = 0; i < 6; i++) {
            int finalI = i;
            executor.execute(() ->{
                try {
                    System.out.println(Thread.currentThread().getName() + " 开始执行 " + finalI);
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(Thread.currentThread().getName() + "已经结束执行" + finalI);
                } catch (Exception e){
                    e.printStackTrace();
                }
            });
        }

        TimeUnit.SECONDS.sleep(1);
        System.out.println("线程池中线程数量：" + executor.getPoolSize());
        TimeUnit.SECONDS.sleep(5);
        System.out.println("线程池中线程数量：" + executor.getPoolSize());

        executor.shutdown();

    }
}
