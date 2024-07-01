package com.totoro.javastudy.data_structure.linked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    LinkedList<Integer> list = new LinkedList<>();

    @Test
    void testAdd(){
        for (int i = 0; i < 5; i++) {
            list.add(i,i);
        }
        System.out.println(list);
        list.add(100,2);
        System.out.println(list);

        System.out.println(list.remove(2));
        System.out.println(list.get(2));


    }





}