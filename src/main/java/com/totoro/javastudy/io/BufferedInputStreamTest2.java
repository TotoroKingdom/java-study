package com.totoro.javastudy.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamTest2 {
    public static void main(String[] args) {

        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("hello.txt"))){
            bufferedInputStream.mark(1); //保留一个字符到buffer
            System.out.println((char) bufferedInputStream.read());
            System.out.println((char) bufferedInputStream.read());
            bufferedInputStream.reset();        //回到mark位置
            System.out.println("回到mark");
            System.out.println((char) bufferedInputStream.read());
            System.out.println((char) bufferedInputStream.read());
        }catch (IOException e){
            e.printStackTrace();
        }

        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("hello.txt"),1)){
            System.out.println("限制缓冲区大小,mark保存的大小由缓冲区和readlimit中的最大值决定");
            bufferedInputStream.mark(1); //保留一个字符到buffer
            System.out.println((char) bufferedInputStream.read());
            System.out.println((char) bufferedInputStream.read());
            bufferedInputStream.reset();        //回到mark位置
            System.out.println("回到mark");
            System.out.println((char) bufferedInputStream.read());
            System.out.println((char) bufferedInputStream.read());
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
