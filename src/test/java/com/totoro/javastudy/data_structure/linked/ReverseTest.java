package com.totoro.javastudy.data_structure.linked;

public class ReverseTest {

    public static void main(String[] args) {

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);


        print(node);
        Node reverse = reverse(node);

        print(reverse);

    }

    public static void print(Node node){
        while (node != null){
            System.out.println(node.e);
            node = node.next;
        }

    }
    public static Node reverse(Node node){
        Node cur = node;
        Node pre = null;

        while (cur != null){
            Node temp = cur.next; //暂存将要断开的节点
            cur.next = pre; //当前节点指向前一个节点
            pre = cur;  //pre后移
            cur = temp; //cur后移


        }

        return pre;
    }



    static class Node{
        Integer e;
        Node next;

        public Node(Integer e) {
            this.e = e;
        }

    }
}
