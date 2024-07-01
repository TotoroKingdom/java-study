package com.totoro.javastudy.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

    public static void main(String[] args) {


        try(FileOutputStream outputStream = new FileOutputStream("out.txt")){
            FileInputStream inputStream = new FileInputStream("hello.txt");
            byte[] bytes = new byte[10];
            int tmp;
            while ((tmp = inputStream.read(bytes)) != -1){
                outputStream.write(bytes, 0, tmp);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
