package com.totoro.javastudy.io;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {

        File file = new File("hello.txt");
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.isDirectory());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
    }
}
