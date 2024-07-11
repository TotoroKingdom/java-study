package com.totoro.javastudy.nio;

import java.nio.ByteBuffer;

/**
 * @author totoro
 * @date 2024年07月11日 19:10
 * @description
 */

public class ByteBufferTest {
    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocate(5);
        System.out.println(buffer);
        buffer.put("tom".getBytes());
        System.out.println("放入tom三个字符"+buffer);
        byte b = buffer.get();
        byte a = buffer.get();
        byte c = buffer.get();
        System.out.println(b + " 读取模式：" + buffer);

    }
}
