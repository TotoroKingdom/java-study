package com.totoro.javastudy.generics.optional;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        Optional<String> hello = Optional.ofNullable("hello");

        System.out.println(hello.isPresent());
        System.out.println(hello.orElseGet(() -> "test"));
        System.out.println(hello.map(s -> "world" + s).orElse("java"));

        Optional<Object> o = Optional.ofNullable(null);
        System.out.println(o.isPresent());
        System.out.println(o.orElseGet(() -> "test"));
        System.out.println(o.map(s -> "world" + s).orElse("java"));

    }
}
