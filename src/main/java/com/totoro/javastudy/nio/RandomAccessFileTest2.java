package com.totoro.javastudy.nio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author totoro
 * @date 2024年07月12日 10:37
 * @description
 */

public class RandomAccessFileTest2 {
    public static void main(String[] args) {

        try(RandomAccessFile file = new RandomAccessFile("random.txt","rw")){
            FileChannel channel = file.getChannel();
            channel.truncate(10);
            ByteBuffer buffer = ByteBuffer.allocate(128);
            channel.read(buffer);
            buffer.flip();
            System.out.println(new String(buffer.array(), 0, buffer.remaining()));

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
