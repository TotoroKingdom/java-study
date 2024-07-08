package com.totoro.javastudy.reflect;

import java.lang.reflect.Type;

public class GetGenericSuperclassTest {
    public static void main(String[] args) {
        Integer i = 10;
        Type type = i.getClass().getGenericSuperclass();
        System.out.println(type);
        System.out.println(type instanceof Class);

        Integer j = 100;
        for (Class<?> anInterface : j.getClass().getInterfaces()) {
            System.out.println(anInterface.getName());
        }

        for (Type genericInterface : j.getClass().getGenericInterfaces()) {
            System.out.println(genericInterface.getTypeName());
        }

    }
}
