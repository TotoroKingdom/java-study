package com.totoro.javastudy.generics.function;

import com.totoro.javastudy.generics.function.Apple;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        Function<Integer, String> function = Object::toString;

        String apply = function.apply(10);

        System.out.println(apply);

        String test = function.compose((String s) -> s.length()).apply("test");
        System.out.printf(test);

        Boolean aBoolean = function
                .andThen(String::isEmpty)
                .apply(10);

        System.out.println(aBoolean);


    }
}
