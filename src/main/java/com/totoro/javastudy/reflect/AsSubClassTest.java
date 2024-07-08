package com.totoro.javastudy.reflect;

public class AsSubClassTest {
    public static void main(String[] args) {

        Integer i = 10;
        Class<? extends Number> subclass = i.getClass().asSubclass(Number.class);
        System.out.println(subclass);

    }
}
