package com.totoro.javastudy.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {
    public static void main(String[] args) {

        try(OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("fileOut.txt"))){
            outputStreamWriter.write("do something 哈哈哈");
            outputStreamWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
