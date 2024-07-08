package com.totoro.javastudy.reflect;

public class GetSuperclassTest {

    public static void main(String[] args) {
        Integer i = 10;

        System.out.println(i.getClass().getSuperclass());
        System.out.println(i.getClass().getSuperclass().getSuperclass());
        System.out.println(i.getClass().getSuperclass().getSuperclass().getSuperclass());

    }
}
