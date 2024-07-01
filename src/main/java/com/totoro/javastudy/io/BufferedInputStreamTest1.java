package com.totoro.javastudy.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamTest1 {

    public static void main(String[] args) {

        try( BufferedInputStream bufferedInputStream = new  BufferedInputStream(new FileInputStream("hello.txt"))){
            System.out.println((char) bufferedInputStream.read());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
