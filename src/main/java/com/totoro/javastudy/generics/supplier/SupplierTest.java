package com.totoro.javastudy.generics.supplier;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {


        Supplier<Apple> appleSupplier = Apple::new;

        Apple apple = appleSupplier.get();
        apple.hello();
    }
}
