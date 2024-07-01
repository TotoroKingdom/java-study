package com.totoro.javastudy.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {

    public static void main(String[] args) {

        try(FileWriter fileWriter = new FileWriter("fileWriter.txt",true)){
            String encoding = fileWriter.getEncoding();
            System.out.println(encoding);

            fileWriter.write("勇敢牛牛");
            fileWriter.append("不怕困难");
            fileWriter.flush();

        }catch (IOException e){
            e.printStackTrace();
        }

        try(FileReader fileReader = new FileReader("fileWriter.txt")){
            System.out.println("begin");
            char[] chars = new char[10];
            fileReader.read(chars);
            System.out.println(chars);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
