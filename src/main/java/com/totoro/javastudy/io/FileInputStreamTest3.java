package com.totoro.javastudy.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

    private static final String url = "src/main/resources/hello.txt";

    public static void main(String[] args) {

        try(FileInputStream inputStream = new FileInputStream(url)){
            byte[] bytes = new byte[inputStream.available()];
            System.out.println(inputStream.read(bytes));
            System.out.println(bytes);
            System.out.println(new String(bytes));
            System.out.println();
        }catch (IOException e){
            e.printStackTrace();
        }

        try(FileInputStream inputStream = new FileInputStream(url)){
            byte[] bytes = new byte[inputStream.available()];
            //从第一个开始读,读5个
            System.out.println(inputStream.read(bytes,0,5));
            //跳过一个
            inputStream.skip(1);
            System.out.println(inputStream.read(bytes));
            System.out.println(bytes);
            System.out.println(new String(bytes));
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
