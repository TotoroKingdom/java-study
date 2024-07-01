package com.totoro.javastudy.io;

import java.io.*;

public class BufferedWriterTest1 {

    public static void main(String[] args) {

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("fileWriter.txt"))){
            writer.newLine();
            writer.write("风萧萧兮易水寒");
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
