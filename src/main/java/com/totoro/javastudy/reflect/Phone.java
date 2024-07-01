package com.totoro.javastudy.reflect;

public class Phone {

    public Object test(){
        System.out.println("phone");
        Apple apple = new Apple();
        apple.setId("1");
        apple.setBrand("11");
        apple.setColor("111");
        return apple;
    }

}
