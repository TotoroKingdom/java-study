package com.totoro.javastudy.generics.consumer;

import java.util.function.Consumer;

public class ConsumerTest {



    public static void main(String[] args) {

        Consumer<Apple> appleConsumer = apple -> {
            System.out.println("apple");
        };

        Apple apple = new Apple();

//        appleConsumer.accept(apple);

        Consumer<Apple> appleConsumer1 = Apple::hello;

//        appleConsumer1
//                .andThen(a -> System.out.println("吃饭"))          //2
//                .andThen(a -> System.out.println("喝可乐"))        //3
//                .accept(apple);                                   //1

        System.out.println("============================");
        Consumer<Apple> appleConsumer2 = appleConsumer.andThen(appleConsumer1);
        appleConsumer2.accept(apple);


    }


}
