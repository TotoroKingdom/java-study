package com.totoro.javastudy.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {

    public static void main(String[] args) {

        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("fileOut.txt"))){
            System.out.println(dataInputStream.readChar());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
