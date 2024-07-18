package com.totoro.javastudy.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: totoro
 * @createDate: 2024 07 19 00 48
 * @description:
 **/
public class JDKProxyTest {

    public static void main(String[] args) {

        Apple apple = new Apple();
        IApple iApple =(IApple) Proxy.newProxyInstance(JDKProxyTest.class.getClassLoader(), new Class[]{IApple.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("喜欢可乐");

                apple.apple();

                System.out.println("喜欢雪碧");

                return null;
            }
        });

        iApple.apple();
    }
}
