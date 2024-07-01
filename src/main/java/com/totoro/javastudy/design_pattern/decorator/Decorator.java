package com.totoro.javastudy.design_pattern.decorator;

public class Decorator extends Shop{

    protected Shop shop;

    public Decorator(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void sell() {
        shop.sell();
    }
}
