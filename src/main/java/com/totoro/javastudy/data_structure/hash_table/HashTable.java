package com.totoro.javastudy.data_structure.hash_table;

public class HashTable<E> {

    private final int TABLE_SIZE = 10;
    private final Node<E>[] TABLE = new Node[TABLE_SIZE];

    public HashTable(){
        for (int i = 0; i < TABLE_SIZE; i++) {
            TABLE[i] = new Node<>(null);
        }
    }


    private void insert(E element){
        int index = hash(element);
        Node<E> prev = TABLE[index];
        while (prev.next != null){
            prev = prev.next;
        }
        prev.next = new Node<>(element);
    }

    public boolean contains(E element){

        int index = hash(element);
        Node<E> node =TABLE[index].next;
        while (node != null){
            if (node.element == element){
                return true;
            }
            node = node.next;
        }

        return false;
    }


    private int hash(Object o){
        int hashCode = o.hashCode();
        return hashCode % TABLE_SIZE;
    }

    private static class Node<E>{
        private final E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

}
