package com.totoro.javastudy.data_structure.stack;

import java.util.NoSuchElementException;

public class LinkedStack<E> {

    private final Node<E> head = new Node<>(null);

    public void push(E element){
        Node<E> node = new Node<>(element);
        node.next = head.next;
        head.next = node;

    }

    public E pop(){
        if (head.next == null){
            throw new NoSuchElementException("栈为空");
        }

        E e = head.next.element;
        head.next = head.next.next;
        return e;
    }

    private static class Node<E>{
        E element;
        Node<E> next;
        public Node(E element){
            this.element = element;
        }
    }
}
