package com.totoro.javastudy.design_pattern.decorator;

public class DecoratorImpl extends Decorator{
    public DecoratorImpl(Shop shop) {
        super(shop);
    }

    @Override
    public void sell() {
        System.out.println("加点装饰");
        super.sell();
        System.out.println("再加点装饰");
    }
}
