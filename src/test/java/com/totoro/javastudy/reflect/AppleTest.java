package com.totoro.javastudy.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException {

        Class<?> aClass = Class.forName("com.totoro.javastudy.reflect.Phone");
        Object o = aClass.newInstance();

        Method[] methods = aClass.getDeclaredMethods();

        for (Method method : methods) {
            String name = method.getName();
            System.out.println("方法名" + name);

            if (("test").equals(name)){
                System.out.println("开始执行方法");
                method.invoke(o);
            }

        }

        System.out.println(o);

    }

}