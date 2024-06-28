package com.totoro.javastudy.generics.predicate;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        Predicate<String> isUserNameValid = u -> u !=null && u.length()>5 && u.length()<10;
        boolean hello = isUserNameValid.test("hello");
        System.out.println(hello);

    }
}
