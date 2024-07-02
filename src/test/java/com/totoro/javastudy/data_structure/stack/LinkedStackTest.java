package com.totoro.javastudy.data_structure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {

    @Test
    void testPush(){
        LinkedStack<Integer> stack = new LinkedStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }

}