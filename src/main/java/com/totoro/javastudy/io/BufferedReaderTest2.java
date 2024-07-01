package com.totoro.javastudy.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest2 {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("fileWriter.txt"))) {

            reader.lines()
                    .limit(2)
                    .distinct()
                    .sorted()
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
