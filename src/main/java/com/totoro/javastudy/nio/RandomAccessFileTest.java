package com.totoro.javastudy.nio;


import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author totoro
 * @date 2024年07月12日 10:03
 * @description
 */

public class RandomAccessFileTest {

    /**
     * 通过RandomAccessFile进行创建，注意后面的mode有几种：
     * r     以只读的方式使用
     * rw   读操作和写操作都可以
     * rws  每当进行写操作，同步的刷新到磁盘，刷新内容和元数据
     * rwd  每当进行写操作，同步的刷新到磁盘，刷新内容
     */
    public static void main(String[] args) {

        try(RandomAccessFile file = new RandomAccessFile("random.txt","rw")){
            FileChannel channel = file.getChannel();
            channel.write(ByteBuffer.wrap("喜欢吃西瓜".getBytes()));
            System.out.println("写操作完成后文件访问位置："+channel.position());
            channel.position(0);

            ByteBuffer buffer = ByteBuffer.allocate(128);
            channel.read(buffer);
            buffer.flip();

            System.out.println(new String(buffer.array(), 0 ,buffer.remaining()));

        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
