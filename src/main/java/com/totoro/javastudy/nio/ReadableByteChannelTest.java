package com.totoro.javastudy.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * @author totoro
 * @date 2024年07月11日 19:44
 * @description
 */

public class ReadableByteChannelTest {

    public static void main(String[] args) throws IOException {

        ByteBuffer buffer = ByteBuffer.allocate(5);
        ReadableByteChannel readChannel = Channels.newChannel(System.in);

        while (true){
            readChannel.read(buffer);

            buffer.flip();

            System.out.println(new String(buffer.array(),0,buffer.remaining()));
        }

    }
}
