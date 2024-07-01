package com.totoro.javastudy.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest1 {

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("fileWriter.txt"))){
            System.out.println((char) reader.read() );
            System.out.println(reader.lines());
            System.out.println(reader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
