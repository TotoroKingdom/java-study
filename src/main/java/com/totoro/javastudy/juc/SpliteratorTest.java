package com.totoro.javastudy.juc;


import java.util.*;

public class SpliteratorTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 2, 9, 3, 6, 0));

        list.parallelStream()
                        .forEach(i -> System.out.println(Thread.currentThread().getName() + "-> " + i));

        //并行流
        list.parallelStream()
                .forEachOrdered(System.out::println);

        int[] arr = new int[]{1, 4, 5, 2, 9, 3, 6, 0};
        //并行排序
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[]{1, 4, 5, 2, 9, 3, 0, 0};
        Arrays.parallelSetAll((arr1), i->{
            System.out.println(Thread.currentThread().getName());
            return arr1[i];
        });
        System.out.println(Arrays.toString(arr1));

    }
}
