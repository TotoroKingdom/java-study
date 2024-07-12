package com.totoro.javastudy.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author totoro
 * @date 2024年07月12日 9:33
 * @description
 */

public class FileChannelTest {
    public static void main(String[] args) throws IOException {

        //用流输出和输入
        File file = new File("test.txt");


        try(FileOutputStream out = new FileOutputStream(file))   {
            FileInputStream in = new FileInputStream("test.txt");
            String data = "喜欢喝可乐";
            out.write(data.getBytes());
            out.flush();

            byte[] bytes = new byte[in.available()];
            in.read(bytes);
            System.out.println(new String(bytes));
        } catch (Exception e){
            e.printStackTrace();
        }



        //用通道和buffer输出
        FileOutputStream outStream = new FileOutputStream("test.txt");
        FileChannel outChannel = outStream.getChannel();
        ByteBuffer outBuffer = ByteBuffer.wrap("喜欢喝啤酒".getBytes());
        outChannel.write(outBuffer);

        //用通道和buffer输入
        FileInputStream inStream = new FileInputStream("test.txt");
        FileChannel channel = inStream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(128);
        channel.read(buffer);
        buffer.flip();
        System.out.println(new String(buffer.array(),0 , buffer.remaining()));


    }
}
