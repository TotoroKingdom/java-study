package com.totoro.javastudy.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.remove((Integer) 10);
        System.out.println(list);
        list.add(new Integer(10));
        list.remove(new Integer(10));
        System.out.println(list.size());
    }
}
