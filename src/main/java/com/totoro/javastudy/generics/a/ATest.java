package com.totoro.javastudy.generics.a;

public class ATest {

    public static void main(String[] args) {

        Phone<Apple,String> applePhone = new Phone<Apple, String>(1,new Apple("苹果"),"iphone");

        Phone<String,String> huawei = new Phone<>(1, "华为","huawei");

        System.out.println(applePhone);
        System.out.println(huawei);
    }
}
