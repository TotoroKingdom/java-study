package com.totoro.javastudy.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest1 {

    public static void main(String[] args) {

        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("out.txt",true))){
            bufferedOutputStream.write("curiosity".getBytes());
            bufferedOutputStream.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
