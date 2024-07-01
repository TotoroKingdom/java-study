package com.totoro.javastudy.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

    public static void main(String[] args) {

        try(FileOutputStream outputStream = new FileOutputStream("hello.txt",true)){

            outputStream.write('@');
            outputStream.write("hello apple".getBytes());
            outputStream.write("hello apple".getBytes(), 0,5);
            outputStream.flush();
            outputStream.write(" apple".getBytes());
            outputStream.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
