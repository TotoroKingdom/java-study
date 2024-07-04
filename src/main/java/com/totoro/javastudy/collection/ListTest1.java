package com.totoro.javastudy.collection;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("科技");
        list.add("狠活");
        list.add("上头");
        System.out.println(list);
        list.sort(Comparator.comparing(String::length));
        System.out.println(list);


    }
}
