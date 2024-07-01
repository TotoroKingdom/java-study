package com.totoro.javastudy.io;


import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {


    public static void main(String[] args) {

        try(InputStreamReader reader = new InputStreamReader(new FileInputStream("fileOut.txt"))){

            char[] chars = new char[10];
            reader.read(chars);

            System.out.println(chars);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
