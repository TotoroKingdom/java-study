package com.totoro.javastudy.juc_advanced;

import javax.rmi.CORBA.Stub;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @author totoro
 * @date 2024年07月11日 10:00
 * @description
 */

public class AtomicIntegerFileUpdaterTest {
    public static void main(String[] args) {

        Apple apple = new Apple();

        AtomicIntegerFieldUpdater<Apple> fieldUpdater = AtomicIntegerFieldUpdater.newUpdater(Apple.class, "apple");

        System.out.println(fieldUpdater.incrementAndGet(apple));


    }

    public static class Apple{
        volatile int apple;
    }
}
