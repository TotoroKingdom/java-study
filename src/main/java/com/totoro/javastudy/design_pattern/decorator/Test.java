package com.totoro.javastudy.design_pattern.decorator;

public class Test {

    public static void main(String[] args) {

        ShopImpl shop = new ShopImpl();
        Decorator decorator = new DecoratorImpl(shop);
        Decorator outer = new DecoratorImpl(decorator);
//        decorator.sell();

        outer.sell();


    }
}
