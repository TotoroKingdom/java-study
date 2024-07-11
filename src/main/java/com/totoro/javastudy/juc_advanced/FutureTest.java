package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author totoro
 * @date 2024年07月11日 11:38
 * @description
 */

public class FutureTest {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> {
        }, "喜欢喝可乐");
        System.out.println(future.get());
        Future<String> future1 = executor.submit(() -> "喜欢喝可乐");
        System.out.println(future1.get());

        executor.shutdown();

    }
}
