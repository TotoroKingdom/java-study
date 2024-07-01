package com.totoro.javastudy.data_structure.suquence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    ArrayList<Integer> list = new ArrayList<>();

    @Test
    public void testAdd1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10,0);
    }

    @Test
    public void testAdd2(){

        for (int i = 0; i < 20; i++) {
            list.add(i, i);
        }
        System.out.println(list);
    }

    @Test
    public void testRemove(){
//        testAdd2();
        list.remove(0);
        System.out.println(list);
    }

    @Test
    public void testGet(){
        testAdd2();
        testRemove();
        Integer i = list.get(19);
        System.out.println(i);

    }

}