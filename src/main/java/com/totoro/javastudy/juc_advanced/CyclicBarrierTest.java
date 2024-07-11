package com.totoro.javastudy.juc_advanced;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author totoro
 * @date 2024年07月11日 13:48
 * @description
 */

public class CyclicBarrierTest {
    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(10,
                () -> System.out.println("飞机马上起飞。。。"));

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() ->{
                try {
                    Thread.sleep((long) (2000 * new Random().nextDouble()));
                    System.out.println("玩家：" + finalI + "开始等待。。。" + cyclicBarrier.getNumberWaiting() + "/10");
                    cyclicBarrier.await();
                    System.out.println("玩家 " + finalI + " 进入游戏");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }

    }
}
