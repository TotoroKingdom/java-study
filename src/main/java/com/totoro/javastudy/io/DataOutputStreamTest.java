package com.totoro.javastudy.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

    public static void main(String[] args) {

        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("fileOut.txt",true))){
            dataOutputStream.writeBoolean(true);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
