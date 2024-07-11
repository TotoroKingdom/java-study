package com.totoro.javastudy.juc_advanced;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author totoro
 * @date 2024年07月11日 10:11
 * @description
 */

public class AtomicStampedReferenceTest {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        AtomicStampedReference<String> reference = new AtomicStampedReference<>(a, 1);
        reference.attemptStamp(a, 2);
        System.out.println(reference.compareAndSet(a, b, 2, 3));
    }
}
