package com.totoro.javastudy.data_structure.queue;

import java.util.NoSuchElementException;

public class LinkedQueue<E> {

    private final Node<E> head = new Node<>(null);

    public void offer(E element){

        Node<E> newNode = new Node<>(element);

        Node<E> tail = head;

        while (tail.next != null){
            tail = tail.next;
        }

        tail.next = newNode;

    }

    public E poll(){

        if (head.next == null){
            throw new NoSuchElementException("队列为空");
        }
        E element = head.next.element;

        head.next = head.next.next;

        return element;
    }


    private static class Node<E>{
        E element;

        Node<E> next;

        public Node(E element){
            this.element = element;
        }
    }
}
