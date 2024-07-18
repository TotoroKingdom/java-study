package com.totoro.javastudy.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Method;

/**
 * @author: totoro
 * @createDate: 2024 07 19 01 10
 * @description:
 **/
public class CGLIBTest {
    public static void main(String[] args) {


        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(Apple.class);
        enhancer.setCallback(new ProxyFactory());

        Apple apple = (Apple) enhancer.create();

        apple.apple();


    }


}
