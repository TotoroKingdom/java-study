package com.totoro.javastudy.io;

import java.io.*;
import java.lang.reflect.Method;

public class ObjectOutputStreamTest {

    public static void main(String[] args) {

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("fileOut.txt"))){
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("fileOut.txt"));
            Apple apple = new Apple("苹果");
            outputStream.writeObject(apple);
            outputStream.flush();

            Apple o = (Apple) inputStream.readObject();


            System.out.println(o.name);


        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


    static class Apple implements Serializable{
        String name;

        public Apple(String name) {
            this.name = name;
        }
    }
}
