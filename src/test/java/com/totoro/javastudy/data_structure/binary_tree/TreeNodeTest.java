package com.totoro.javastudy.data_structure.binary_tree;

import org.junit.jupiter.api.Test;

class TreeNodeTest {

    @Test
    void tree(){
        TreeNode<Character> a = new TreeNode<>('A');
        TreeNode<Character> b = new TreeNode<>('B');
        TreeNode<Character> c = new TreeNode<>('C');
        TreeNode<Character> d = new TreeNode<>('D');
        TreeNode<Character> e = new TreeNode<>('E');

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;

        System.out.println(a.left.left.element);
    }

}