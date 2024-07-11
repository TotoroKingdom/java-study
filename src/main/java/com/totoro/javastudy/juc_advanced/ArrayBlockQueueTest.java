package com.totoro.javastudy.juc_advanced;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author totoro
 * @date 2024年07月11日 10:22
 * @description
 */

public class ArrayBlockQueueTest {

    public static void main(String[] args) {

        ArrayBlockingQueue<Object> queue = new ArrayBlockingQueue<>(1);
        Runnable supplier = () -> {
            while (true){
                try {
                    String name = Thread.currentThread().getName();
                    System.err.println(time() + " 生产者 " + name + " 正在准备... ");
                    TimeUnit.SECONDS.sleep(3);
                    System.err.println(time() + " 生产者 " + name + " 已出餐... ");
                    queue.add(new Object());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        };

        Runnable consumer = () -> {
            while (true){
                try {
                    String name = Thread.currentThread().getName();
                    System.out.println(time() + " 消费者 " + name + " 等待干饭... ");
                    Object take = queue.take();
                    System.out.println(time() + " 消费者 " + name + " 开始干饭... ");
                    TimeUnit.SECONDS.sleep(4);
                    System.out.println(time() + " 消费者 " + name + " 干饭完成... ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        };

        for (int i = 0; i < 2; i++) {
            new Thread(supplier,"supplier"+ i).start();
        }
        for (int i = 0; i < 3; i++) {
            new Thread(consumer, "consumer" + i).start();
        }

    }

    private static String time(){
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        return format.format(new Date());
    }
}
