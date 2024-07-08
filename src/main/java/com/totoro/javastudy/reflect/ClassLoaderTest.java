package com.totoro.javastudy.reflect;

public class ClassLoaderTest {

    public static void main(String[] args) {

        System.out.println(ClassLoaderTest.class.getClassLoader());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent().getParent());
        System.out.println(String.class.getClassLoader());

    }
}
