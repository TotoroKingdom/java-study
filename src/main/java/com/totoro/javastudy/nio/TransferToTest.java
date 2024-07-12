package com.totoro.javastudy.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * @author totoro
 * @date 2024年07月12日 10:40
 * @description
 */

public class TransferToTest {
    public static void main(String[] args) {
        try(FileOutputStream out = new FileOutputStream("test1.txt",true)){
            FileInputStream in = new FileInputStream("test.txt");

            FileChannel channel = in.getChannel();
            channel.transferTo(0, channel.size(), out.getChannel());

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
