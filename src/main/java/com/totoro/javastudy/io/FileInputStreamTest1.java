package com.totoro.javastudy.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream("src/main/resources/hello.txt");
            System.out.println(fileInputStream);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                if ( fileInputStream != null){
                    fileInputStream.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }

        }

    }
}
