package com.totoro.javastudy.nio;

import java.nio.ByteBuffer;

/**
 * @author totoro
 * @date 2024年07月12日 9:25
 * @description
 */

public class AllocateDirectTest {
    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocateDirect(10);
        buffer.put((byte) 66);
        buffer.flip();
        System.out.println(buffer.get());

    }
}
