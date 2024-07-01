package com.totoro.javastudy.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest3 {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("fileWriter.txt"))){
            reader.mark(1);
            System.out.println((char) reader.read());
            reader.reset();
            System.out.println((char) reader.read());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
