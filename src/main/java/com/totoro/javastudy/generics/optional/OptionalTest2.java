package com.totoro.javastudy.generics.optional;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {

        String a = null;
        String b = "132";
        boolean present = Optional.ofNullable(a).isPresent();
        System.out.println(present);


    }
}
