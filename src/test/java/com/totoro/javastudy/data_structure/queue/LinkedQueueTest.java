package com.totoro.javastudy.data_structure.queue;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueTest {

    @Test
    void testOfferAndPoll(){
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        for (int i = 0; i < 5; i++) {
            queue.offer(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(queue.poll());
        }

    }

}