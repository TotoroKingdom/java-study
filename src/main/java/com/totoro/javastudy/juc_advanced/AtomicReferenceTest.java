package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author totoro
 * @date 2024年07月11日 9:57
 * @description
 */

public class AtomicReferenceTest {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        AtomicReference<String> reference = new AtomicReference<>(a);
        reference.compareAndSet(a, b);
        System.out.println(reference.compareAndSet(a,b));
        System.out.println(reference.get());

    }
}
