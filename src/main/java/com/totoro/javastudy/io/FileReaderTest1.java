package com.totoro.javastudy.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {
    public static void main(String[] args) {

        try(FileReader fileReader = new FileReader("hello.txt")) {

            int read = fileReader.read();
            System.out.println("read="+read);

            char[] chars = new char[100];
            fileReader.read(chars);
            System.out.println(chars);


            String encoding = fileReader.getEncoding();
            System.out.println(encoding);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
