package com.totoro.javastudy.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

    public static void main(String[] args) {

        try(FileInputStream inputStream = new FileInputStream("src/main/resources/hello.txt")){
            int temp;
            while ( (temp = inputStream.read()) != -1){

                System.out.print((char) temp);
                //查看字节剩余数量
                System.out.println(inputStream.available());
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
