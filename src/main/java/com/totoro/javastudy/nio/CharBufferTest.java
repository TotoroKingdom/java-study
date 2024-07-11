package com.totoro.javastudy.nio;


import java.nio.CharBuffer;
import java.util.Arrays;

/**
 * @author totoro
 * @date 2024年07月11日 19:52
 * @description
 */

public class CharBufferTest {
    public static void main(String[] args) {

        CharBuffer buffer = CharBuffer.allocate(10);
        String hello = new String("hello");
        buffer.put(hello);
        System.out.println(buffer);
        buffer.flip();
        System.out.println(buffer.get());
        System.out.println(buffer);

    }
}
